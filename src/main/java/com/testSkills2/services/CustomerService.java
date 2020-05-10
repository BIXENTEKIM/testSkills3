package com.testSkills2.services;


import com.testSkills2.configs.DataTablesRequest;
import com.testSkills2.configs.DataTablesResult;
import com.testSkills2.model.Customers;

import java.util.List;

public interface CustomerService {

    public void  addCustomer(Customers cust);
    public void  deleteCustomer(Long custId);
    public void  updateCustomer(Customers cust);
    public Customers  getCustomer(Long custId);
    public List<Customers> getCustomersByAge(Long age);
    public List<Customers> getCustomers();
}
