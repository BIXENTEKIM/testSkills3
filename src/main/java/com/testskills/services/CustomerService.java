package com.testskills.services;

import com.testskills.model.Customers;

import java.util.List;

public interface CustomerService {

    public void  addCustomer(Customers cust);
    public void  deleteCustomer(Long custId);
    public void  updateCustomer(Customers cust);
    public Customers  getCustomer(Long custId);
    public List<Customers> getCustomers(Long age);
}
