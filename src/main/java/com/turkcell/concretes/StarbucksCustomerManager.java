package com.turkcell.concretes;

import com.turkcell.abstracts.BaseCustomManager;
import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.abstracts.ICustomerService;
import com.turkcell.adapter.MernisService;
import com.turkcell.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomManager {
    private ICustomerCheckService _customerCheckService;
    public StarbucksCustomerManager(ICustomerService customercheckservice){
        _customerCheckService = (ICustomerCheckService) customercheckservice;//parametre olmayınca hata
    }
    public void save(Customer customer){
        if (_customerCheckService.checkIfRealCustomer(customer)){
            super.save(customer);
        }
        else {
            System.out.println("Kayıt yapılamadı.Kullanıcı gerçek bir kişi değil.");
        }
    }
}

