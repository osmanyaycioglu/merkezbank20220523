package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication {

    public static void main(String[] args) {
        // Spring ayağa kaldıran satır
        ConfigurableApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);
        Greetings greetings = context.getBean(Greetings.class);
        greetings.sayHello("osman");
        greetings.sayGoodbye("osman");

//		Hello hello = new Hello();
//		Hello hello2 = new Hello();
//		Hello hello3 = new Hello();
//		// Instance 1
//		System.out.println(hello.helloWorld("osman"));
//		System.out.println(hello.helloWorld("osman"));
//		System.out.println(hello.helloWorld("osman"));
//		System.out.println(hello.helloWorld("osman"));
//		System.out.println(hello.helloWorld("osman"));
//		// Instance 2
//		System.out.println(hello2.helloWorld("osman 2"));
//		System.out.println(hello2.helloWorld("osman 2 "));
//		// Instance 3
//		System.out.println(hello3.helloWorld("osman 3"));
//		System.out.println(hello3.helloWorld("osman 3"));
//		System.out.println(hello3.helloWorld("osman 3"));
//		// Instance 1
//		System.out.println(hello.helloWorld("osman"));

    }

}
