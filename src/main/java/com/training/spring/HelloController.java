package com.training.spring;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello/xyz/abc")
public class HelloController {

    @GetMapping
    public String hello1dhgf(){
        return "Hello world Root";
    }

    @GetMapping("/hello2/deneme/test")
    public String hellofdvghdf(){
        return "Hello world Test";
    }

    // @RequestMapping(path = "/hello1",method = RequestMethod.GET)
    @GetMapping("/hello1")
    public String hello1qwe(){
        return "Hello world GET";
    }

    @PostMapping("/hello1")
    public String hello1zxc(){
        return "Hello world POST";
    }

    @PutMapping("/hello1")
    public String hello1ghj(){
        return "Hello world PUT";
    }

    @PatchMapping("/hello1")
    public String hello1er(){
        return "Hello world PATCH";
    }

    @DeleteMapping("/hello1")
    public String hello1dz(){
        return "Hello world DELETE";
    }

}
