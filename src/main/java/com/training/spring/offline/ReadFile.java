package com.training.spring.offline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReadFile {

    @Scheduled(fixedDelay = 10_000,initialDelay = 1_000)
    public void checkFile(){
        System.out.println("File checking");
    }

    @Scheduled(initialDelay = 1_000,cron = "0/10 * * * * *")
    public void readFile(){
        System.out.println("File read");
    }

}
