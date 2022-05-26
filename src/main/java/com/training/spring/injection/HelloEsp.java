package com.training.spring.injection;

import org.springframework.stereotype.Component;


public class HelloEsp implements IHello {

    @Override
    public String sayHello(String name) {
        return "Ola " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Adios " + name;
    }
}
