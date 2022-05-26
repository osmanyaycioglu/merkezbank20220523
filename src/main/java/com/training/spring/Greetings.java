package com.training.spring;

import com.training.spring.lab3.Cikarma;
import com.training.spring.lab3.Toplama;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy // Bu bean başka bir bean içine inject edildiğinde :  Kullanıldığında yarat
public class Greetings {
    @Autowired // Field Injection - Önerilmiyor
    private Hello hello;
    private Goodbye goodbye;

    private Goodbye goodbye2;

    private Toplama toplama;

    private Cikarma cikarma;
    private String prefix;
    @Value("${app.greetings.goodbye.string}")
    private String goodbyePrefix;

    @Autowired // Constructor Injection - Önerilen *Not : Autowired yazmanıza gerek yok
    public Greetings(Goodbye goodbye,
                     Toplama toplama,
                     Cikarma cikarma,
                     @Value("${app.greetings.prefix}") String prefix) {
        this.goodbye = goodbye;
        this.toplama = toplama;
        this.cikarma = cikarma;
        goodbye.initMe();
        this.prefix = prefix;
    }

    @PostConstruct
    public void basla(){
        hello.initMe();
    }
    @PreDestroy
    public void oldur(){
        System.out.println("Greetings öldürülüyor");
    }
    @Autowired // Method Injection
    public void inMe(Goodbye goodbye){
        goodbye2 = goodbye;
    }

    public void sayHello(String name) {
        System.out.println(prefix + " " + hello.helloWorld(name));
    }

    public void sayGoodbye(String name) {
        System.out.println(goodbyePrefix + " " + goodbye.goodbye(name));
    }

}
