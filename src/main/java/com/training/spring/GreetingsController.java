package com.training.spring;

import com.training.spring.person.rest.error.ErrorObj;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private Hello hello;

    @Autowired
    private Goodbye goodbye;

    @Autowired
    private Greetings greetings;

    @GetMapping("/hello")
    public String hello(){
        return hello.helloWorld("osman");
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return goodbye.goodbye("osman");
    }


}
