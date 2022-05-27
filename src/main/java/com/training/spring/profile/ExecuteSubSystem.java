package com.training.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class ExecuteSubSystem implements IExecute{

    @Override
    public String execute() {
        return "Sub System";
    }
}
