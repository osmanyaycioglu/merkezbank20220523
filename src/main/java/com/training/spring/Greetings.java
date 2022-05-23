package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greetings {
    @Autowired
    private Hello hello;

    @Autowired
    private Goodbye goodbye;


    public void sayHello(String name){
        System.out.println(hello.helloWorld(name));
    }

    public void sayGoodbye(String name){
        System.out.println(goodbye.goodbye(name));
    }

}
