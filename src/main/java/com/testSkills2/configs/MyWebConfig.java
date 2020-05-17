package com.testSkills2.configs;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@EnableWebMvc
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.testSkills2")
public class MyWebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        String driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String databaseurl = "jdbc:sqlserver://localhost:1401;database=faulu_db;sendStringParametersAsUnicode=false";
        String dbUsername = "sa";
        String dbPassword = "stima@2018#";
        HikariDataSource bean = new HikariDataSource();
        bean.setDriverClassName(driverClassName);
        bean.setJdbcUrl(databaseurl);
        bean.setUsername(dbUsername);
        bean.setPassword(dbPassword);
        bean.setLeakDetectionThreshold(30000);
        return bean;
    }

    @Bean
    public Properties hibernateProperties() {
        String dialect = "org.hibernate.dialect.SQLServerDialect";
        String showSql = "false";
        String formatSql = "true";
        String hbm2ddl = "update";
        String namingStrategy = "org.hibernate.cfg.ImprovedNamingStrategy";
        String cachingEnabled = "true";
        String maxStatements = "250";
        String autoCommit = "true";
        String autoDetection = "class";
        String genstatistics = "false";
        String useCache = "true";
        String cacheClass = "org.hibernate.cache.ehcache.EhCacheRegionFactory";
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", dialect);
        hibernateProperties.setProperty("hibernate.show_sql", showSql);
        hibernateProperties.setProperty("hibernate.format_sql", formatSql);
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", hbm2ddl);
        hibernateProperties.setProperty("hibernate.ejb.naming_strategy", namingStrategy);
        hibernateProperties.setProperty("hikari.dataSource.implicitCachingEnabled", cachingEnabled);
        hibernateProperties.setProperty("hikari.dataSource.maxStatements", maxStatements);
        hibernateProperties.setProperty("hibernate.connection.autocommit", autoCommit);
        hibernateProperties.setProperty("hibernate.archive.autodetection", autoDetection);
        hibernateProperties.setProperty("hibernate.generate_statistics", genstatistics);
        hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", useCache);
        hibernateProperties.setProperty("hibernate.cache.region.factory_class", cacheClass);
        hibernateProperties.setProperty("hibernate.max_fetch_depth", "25");
        return hibernateProperties;
    }

    @Bean(name = "sessionFactory")
    public SessionFactory sessionFactory(DataSource dataSource,
                                         Properties hibernateProperties) {
        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(
                dataSource);
        sessionBuilder.scanPackages("com.testSkills2");
        sessionBuilder.addProperties(hibernateProperties);
        sessionBuilder.setNamingStrategy(ImprovedNamingStrategy.INSTANCE);
        return sessionBuilder.buildSessionFactory();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory()throws NamingException {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(getDataSource());
        em.setPackagesToScan("com.testSkills2");
        em.setPersistenceUnitName("archPersistenceUnit");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties());
        return em;
    }


    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
            EntityManagerFactory emf) {
//        JtaTransactionManager transactionManager = new JtaTransactionManager();
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);

        return transactionManager;
    }


    @Bean(name="database_type")
    public String databaseType(){
        return "mssql";
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/images/**").addResourceLocations(
                "/images/");
        registry.addResourceHandler("/libs/**").addResourceLocations("/libs/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("/fonts/");
    }
}