package com.training.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/name")
    public ResponseEntity<String> name() {
        return ResponseEntity.status(267)
                             .header("X-Forwarded-For",
                                     "192.167.1.0")
                             .body("Kurtuluş savaşı");
    }

    @GetMapping("/owner/{abc}/test/{xyz}")
    public String owner(@PathVariable("abc") String name,
                        @PathVariable("xyz") String surname) {
        return "Kitap sahibi " + name + " " + surname;
    }

    @GetMapping("/owner2")
    public String owner2(@RequestParam("abc") String name,
                         @RequestParam("xyz") String surname) {
        return "Kitap sahibi " + name + " " + surname;
    }

    @GetMapping("/owner3/{isim}")
    public String owner3(@PathVariable("isim") String name,
                         @RequestParam("xyz") String surname) {
        return "Kitap sahibi 3 " + name + " " + surname;
    }

    @GetMapping("/owner5/{op}")
    public String owner3(@PathVariable("op") String operation,
                         HttpServletRequest httpServletRequest) {
        switch (operation){
            case "add": {
                String name = httpServletRequest.getParameter("name");
                return "Owner " + name;
            }
            case "test": {
                String name = httpServletRequest.getParameter("name");
                String surname = httpServletRequest.getParameter("surname");
                return "Owner " + name + " " + surname;
            }
            case "delete": {
                String name = httpServletRequest.getParameter("del");
                return "Deleted " + name ;
            }
         }
        return "Kitap sahibi yok ";
    }

    @PostMapping("/owner4")
    public String owner4(@RequestBody Person person) {
        return "Kitap sahibi 3 " + person;
    }

    @PostMapping("/owner6")
    public Owner owner6(@RequestBody Person person) {
        Owner owner = new Owner();
        owner.setName(person.getName());
        owner.setSurname(person.getSurname());
        owner.setAge(LocalDate.now()
                              .getYear() - person.getBirthday().getYear());
        return owner;
    }

}
