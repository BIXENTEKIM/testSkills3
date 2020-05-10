package com.testSkills2.dao.impl;

import com.testSkills2.configs.DataTablesRequest;
import com.testSkills2.configs.DataTablesResult;
import com.testSkills2.dao.CustomerDAO;
import com.testSkills2.model.Customers;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
@Autowired
 private SessionFactory sessionfactory;

    @Override
    public void addCustomer(Customers cust) {
        sessionfactory.getCurrentSession().saveOrUpdate(cust);
    }

    @Override
    public void deleteCustomer(Long custId) {
        Customers cust = (Customers)sessionfactory.getCurrentSession().load(Customers.class,custId);
         sessionfactory.getCurrentSession().delete(cust);
    }

    @Override
    public void updateCustomer(Customers cust) {
         sessionfactory.getCurrentSession().saveOrUpdate(cust);
    }

    @Override
    public Customers getCustomer(Long custId) {
        Customers cust = (Customers)sessionfactory.getCurrentSession().load(Customers.class,custId);
        return cust;
    }

    @Override
    public List<Customers> getCustomersByAge(Long age) {
        List <Customers >  wateja=  sessionfactory.getCurrentSession().createQuery("from Customers where Age >=:age").list();
        return wateja;

    }

    @Override
//    @Transactional(readOnly = true, propagation= Propagation.NOT_SUPPORTED)
    public List<Customers> getCustomers() {
        List <Customers >  wateja=  sessionfactory.getCurrentSession().createQuery("from Customers").list();

//        Page<Customers> page = (Page<Customers>) sessionfactory.getCurrentSession().createQuery("from Customers").list();
//        return new DataTablesResult<>(request, page);
        return wateja;
    }
}
