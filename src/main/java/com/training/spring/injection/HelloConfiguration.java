package com.training.spring.injection;

import com.deneme.lib.EngineConfiguration;
import com.training.spring.lab3.Toplama;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class HelloConfiguration {


    @Bean
    public IHello helloGeneral(@Value("${app.language}") String language,
                               Toplama toplama) {
        switch (language) {
            case "tr":
                return new HelloTr();
            case "esp":
                return new HelloEsp();
            case "eng":
            default:
                return new Hello();
        }
    }

    @Bean
    public Map<String, Person> myPersonMap(){
        return new HashMap<>();
    }

    @Bean
    public String appName(){
        return "Spring Trainin Application";
    }

    @Bean
    public IHello helloTest() {
        return new Hello();
    }

    @Bean
    public IHello helloTest2() {
        return new Hello();
    }
}
