package com.turkcell.entities;

import com.turkcell.abstracts.IEntity;

import java.util.Date;
//implements Ientity
public class Customer implements IEntity {
    int id;
    String firstName;
    String lastName;
    Date dateOfBirth;
    String nationalId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    public Customer(int id,String firstName, String lastName, Date dateOfBirth, String nationalId ){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.nationalId=nationalId;
    }
}
