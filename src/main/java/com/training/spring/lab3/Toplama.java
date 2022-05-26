package com.training.spring.lab3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toplama {
    private String desc;

    public Toplama(@Value("${app.toplama.desc}") String desc) {
        this.desc = desc;
    }

    public String topla(Integer a,
                        Integer b) {
        int toplamaSonucu = a + b;
        return desc + " " + toplamaSonucu;
    }
}
