package com.training.spring.lab4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HesapMakinesiConfig {

    @Bean
    public IMathOp toplamaOperasyonu(){
        return new Toplama();
    }

    @Bean
    public IMathOp toplamaOperasyonuLamda(){
        return (a,b) -> a + b;
    }

    @Bean
    public IMathOp cikarmaOperasyonu(){
        return new Cikarma();
    }

    @Bean
    public IMathOp cikarmaOperasyonuLamda(){
        return (a1,a2) -> {
            return a1 - a2;
        } ;
    }

    @Bean
    public IMathOp carpmaOperasyonu(){
        return new Carpma();
    }

    @Bean
    public IMathOp bolmeOperasyonu(){
        return new Bolme();
    }

}
