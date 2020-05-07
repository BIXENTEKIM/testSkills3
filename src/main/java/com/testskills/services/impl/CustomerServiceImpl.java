package com.testskills.services.impl;

import com.testskills.dao.CustomerDAO;
import com.testskills.model.Customers;
import com.testskills.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
 @Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
private CustomerDAO customerdao;

    @Override
    public void addCustomer(Customers cust) {
        customerdao.addCustomer(cust);
    }
    @Override
    public void deleteCustomer(Long custId) {
        customerdao.deleteCustomer(custId);
    }

    @Override
    public void updateCustomer(Customers cust) {
        customerdao.updateCustomer(cust);
    }

    @Override
    public Customers getCustomer(Long custId) {
        return customerdao.getCustomer(custId);
    }

    @Override
    public List<Customers> getCustomers(Long age) {
        return customerdao.getCustomers(age);
    }
}
