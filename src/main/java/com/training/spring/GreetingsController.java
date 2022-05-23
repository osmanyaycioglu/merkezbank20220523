package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private Hello hello;

    @Autowired
    private Goodbye goodbye;

    @GetMapping("/hello")
    public String hello(){
        return hello.helloWorld("osman");
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return goodbye.goodbye("osman");
    }

}
