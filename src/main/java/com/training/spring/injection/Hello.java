package com.training.spring.injection;

import org.springframework.stereotype.Component;

@Component("merhaba")
public class Hello implements IHello {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}
