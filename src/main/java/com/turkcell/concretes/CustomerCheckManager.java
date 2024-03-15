package com.turkcell.concretes;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealCustomer(Customer customer) {
        return true;
    }
}
