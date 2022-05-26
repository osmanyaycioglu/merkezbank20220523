package com.training.spring.lab4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hesap/makinesi")
public class HesapMakinesiController {
    private IMathOp toplama;
    private IMathOp cikarma;
    private IMathOp carpma;
    private IMathOp bolme;

    public HesapMakinesiController(@Qualifier("toplamaOperasyonu") IMathOp toplama,
                                   @Qualifier("cikarmaOperasyonu") IMathOp cikarma,
                                   @Qualifier("carpmaOperasyonu") IMathOp carpma,
                                   @Qualifier("bolmeOperasyonu") IMathOp bolme) {
        this.toplama = toplama;
        this.cikarma = cikarma;
        this.carpma = carpma;
        this.bolme = bolme;
    }

    @GetMapping("/toplama")
    public String toplama(@RequestParam("val1") Integer val1,
                          @RequestParam("val2") Integer val2) {
        return "toplama sonuc " + toplama.execute(val1,val2);
    }
    @GetMapping("/cikarma")
    public String cikarma(@RequestParam("val1") Integer val1,
                          @RequestParam("val2") Integer val2) {
        return "cikarma sonuc " + cikarma.execute(val1,val2);
    }

    @GetMapping("/carpma")
    public String carpma(@RequestParam("val1") Integer val1,
                          @RequestParam("val2") Integer val2) {
        return "carpma sonuc " + carpma.execute(val1,val2);
    }

    @GetMapping("/bolme")
    public String bolme(@RequestParam("val1") Integer val1,
                         @RequestParam("val2") Integer val2) {
        return "bolme sonuc " + bolme.execute(val1,val2);
    }

}
