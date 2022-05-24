package com.training.spring;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

@Component
// @ConditionalOnClass(Tomcat.class)
public class Goodbye {

    public String goodbye(String name){
        return "Goodbye " + name;
    }

}
