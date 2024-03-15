package com.turkcell.abstracts;

import com.turkcell.entities.Customer;

public interface ICustomerCheckService {
    public boolean checkIfRealCustomer(Customer customer);
}
