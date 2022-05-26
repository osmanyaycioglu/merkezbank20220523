package com.training.spring.injection;

import org.springframework.stereotype.Component;

@Component("merhaba")
public class Hello {

    public String helloTest(){
        return "Hello";
    }

}
