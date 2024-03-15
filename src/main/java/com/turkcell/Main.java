package com.turkcell;

import com.turkcell.abstracts.BaseCustomManager;
import com.turkcell.adapter.MernisService;
import com.turkcell.concretes.NeroCustomerManager;
import com.turkcell.concretes.StarbucksCustomerManager;
import com.turkcell.entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //BaseCustomManager baseCustomManager1= new NeroCustomerManager();
        BaseCustomManager baseCustomManager= new StarbucksCustomerManager(new MernisService());
        //parametre istedi. hata veriyor.mernis eklenecek,araştır.
        baseCustomManager.save(new Customer(1,"Muhammed Akif","Kar",new Date(1997,27,1),"48400785646"));
        //System.out.println();
    }
}

