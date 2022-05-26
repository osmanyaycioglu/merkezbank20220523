package com.deneme.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfiguration {

    @Bean
    public Engine engine(){
        return new Engine();
    }
}
