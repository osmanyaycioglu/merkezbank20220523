package com.training.spring.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperationConfiguration {

    @Bean
    public Operation operationType1(){
        return new Operation(1,10L,"soman");
    }

    @Bean
    public Operation operationType2(){
        return new Operation(2,20L,"ali");
    }

    @Bean
    public Operation operationType3(){
        return new Operation(3,30L,"veli");
    }

}
