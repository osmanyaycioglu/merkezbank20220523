package com.training.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("subsystem")
public class SubSystemConfiguration {

    @Bean
    public IExecute executeType(){
        return new ExecuteSubSystem();
    }
}
