package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // Bu bean başka bir bean içine inject edildiğinde :  Kullanıldığında yarat
public class Greetings {
    @Autowired // Field Injection - Önerilmiyor
    private Hello hello;
    private Goodbye goodbye;
    private String prefix;

    @Value("${app.greetings.goodbye.string}")
    private String goodbyePrefix;

    @Autowired // Constructor Injection - Önerilen *Not : Autowired yazmanıza gerek yok
    public Greetings(Goodbye goodbye,
                     @Value("${app.greetings.prefix}") String prefix) {
        this.goodbye = goodbye;
        this.prefix = prefix;
    }

    public void sayHello(String name) {
        System.out.println(prefix + " " + hello.helloWorld(name));
    }

    public void sayGoodbye(String name) {
        System.out.println(goodbyePrefix + " " + goodbye.goodbye(name));
    }

}
