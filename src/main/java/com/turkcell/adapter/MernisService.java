package com.turkcell.adapter;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.abstracts.ICustomerService;
import com.turkcell.entities.Customer;

public class MernisService implements ICustomerCheckService, ICustomerService {

    @Override
    public boolean checkIfRealCustomer(Customer customer) {
        return customer.getNationalId()=="48400785646";
    }

    @Override
    public void save(Customer customer) {

    }
}
