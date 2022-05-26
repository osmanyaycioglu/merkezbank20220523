package com.training.spring.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component("goodmorning")
@Scope("prototype")
// @RequestScope
public class Merhaba {
    private int counter;

    public String sayMerhaba(){
        counter++;
        return "Merhaba " + counter;
    }


}
