package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    int counter = 0;
    public Hello() {
        System.out.println("Hello yaratılıyor");
    }
    public String helloWorld(String name){
        counter++;
        return "Hello " + counter + " : " + name;
    }

    public void initMe(){
        System.out.println("Init Hello");
    }

}
