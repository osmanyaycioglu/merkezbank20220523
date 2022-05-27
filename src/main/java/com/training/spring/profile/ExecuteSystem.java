package com.training.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class ExecuteSystem implements IExecute{

    @Override
    public String execute() {
        return "System";
    }
}
