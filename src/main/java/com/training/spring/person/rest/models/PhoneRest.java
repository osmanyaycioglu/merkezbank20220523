package com.training.spring.person.rest.models;

public class PhoneRest {
    private String name;
    private String number;

//    @ManyToOne
//    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
