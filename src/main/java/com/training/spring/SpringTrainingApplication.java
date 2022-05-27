package com.training.spring;

import com.deneme.lib.EngineConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(scanBasePackages = {"com.training.spring","com.deneme.lib"})
@SpringBootApplication
@Import(EngineConfiguration.class)
@PropertySource("classpath:my.properties")
@EnableScheduling
public class SpringTrainingApplication {

    public static void main(String[] args) {
        // Spring ayağa kaldıran satır
        ConfigurableApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);
        Greetings greetings = context.getBean(Greetings.class);
        greetings.sayHello("osman");
        greetings.sayGoodbye("osman");

        Goodbye goodbye = (Goodbye) context.getBean("gulegule");

        // Greetings greetingsInt = new Greetings(new Goodbye(),"deneme");

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
