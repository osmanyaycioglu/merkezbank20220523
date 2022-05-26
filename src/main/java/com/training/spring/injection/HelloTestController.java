package com.training.spring.injection;

import com.deneme.lib.Engine;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/hello/test")
public class HelloTestController {
    private IHello hello;

    @Autowired
    @Qualifier("helloTr")
    private IHello helloTurkish;

    @Autowired
    @Qualifier("helloGeneral")
    private IHello hellogen;

    @Qualifier("myPersonMap")
    @Autowired
    private Map<String, Person> personMap;

    @Autowired
    private Engine engine;

    public HelloTestController(@Qualifier("merhaba") IHello hello) {
        this.hello = hello;
    }

    @GetMapping("/hellogen")
    public String helloTest(@RequestParam("name") String name) {
        return hellogen.sayHello(name);
    }

    @GetMapping("/hello/{lang}")
    public String helloTest(@PathVariable("lang") String language,
                            @RequestParam("name") String name) {
        switch (language) {
            case "tr":
                return helloTurkish.sayHello(name);
            case "eng":
            default:
                return hello.sayHello(name);
        }
    }

    @GetMapping("/goodbye")
    public String helloTestGoodbye(@RequestParam("name") String name) {
        return hello.sayGoodbye(name);
    }


}
