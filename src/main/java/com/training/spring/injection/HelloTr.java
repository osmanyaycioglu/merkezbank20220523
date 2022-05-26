package com.training.spring.injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary - Conflict oluştuğunda bunu kullan
@Component
public class HelloTr implements IHello {

    @Override
    public String sayHello(String name) {
        return "Merhaba " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Güle güle " + name;
    }
}
