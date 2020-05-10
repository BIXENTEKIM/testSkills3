package com.testSkills2.services.impl;


import com.testSkills2.configs.DataTablesResult;
import com.testSkills2.dao.CustomerDAO;
import com.testSkills2.model.Customers;
import com.testSkills2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
// @Transactional
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
    @Transactional(readOnly = true)
    public Customers getCustomer(Long custId) {
        return customerdao.getCustomer(custId);
    }

    @Override
    public List<Customers> getCustomersByAge(Long age) {
        return customerdao.getCustomersByAge(age);
    }

    @Override
  @Transactional(readOnly = true)
    public List<Customers> getCustomers() {
        return customerdao.getCustomers();
    }
}
