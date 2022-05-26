package com.training.spring.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/math/add")
@Validated
public class ToplamaController {

    private Toplama toplama;

    //@Autowired
    public ToplamaController(Toplama toplama) {
        this.toplama = toplama;
    }

    @GetMapping
    public String toplamaYap(@NotNull @RequestParam("val1") Integer val1,
                             @NotNull @RequestParam("val2") Integer val2) {
        return toplama.topla(val1,val2);
    }

}
