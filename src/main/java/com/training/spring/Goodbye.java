package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class Goodbye {

    public String goodbye(String name){
        return "Goodbye " + name;
    }

}
