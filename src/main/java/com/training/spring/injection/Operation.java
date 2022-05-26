package com.training.spring.injection;

import org.springframework.stereotype.Component;

public class Operation {

    private Integer opId;
    private Long xyz;
    private String str;

    public Operation(Integer opId,
                     Long xyz,
                     String str) {
        this.opId = opId;
        this.xyz = xyz;
        this.str = str;
    }

    public String doSomething(){
        return str + " " + xyz + " " + opId;
    }
}
