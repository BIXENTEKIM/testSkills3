package com.testskills.dao.impl;

import com.testskills.dao.CustomerDAO;
import com.testskills.model.Customers;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public List<Customers> getCustomers(Long age) {
        List <Customers >  wateja=  sessionfactory.getCurrentSession().createQuery("from Customers where Age >=:age").list();
        return wateja;

    }
}
