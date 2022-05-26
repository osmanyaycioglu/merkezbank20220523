package com.training.spring.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("/scope/test")
@ApplicationScope
public class MerhabaController {

    @Autowired
    private Merhaba merhaba1;

    @Autowired
    private Merhaba merhaba2;

    @Autowired
    private Merhaba merhaba3;

    @GetMapping
    public String test() {
        return merhaba1.sayMerhaba() + " " + merhaba2.sayMerhaba() + " " + merhaba3.sayMerhaba();
    }

}
