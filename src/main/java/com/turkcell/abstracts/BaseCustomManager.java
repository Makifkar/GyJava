package com.turkcell.abstracts;

import com.turkcell.entities.Customer;

public abstract class BaseCustomManager implements ICustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println("Kullanıcı kaydedildi.");
    }
}
