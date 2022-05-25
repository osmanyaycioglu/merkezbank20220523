package com.training.spring.person.rest;

import com.training.spring.person.models.Person;
import com.training.spring.person.rest.models.PersonRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person/info")
public class PersonChangeController {

    @PostMapping("/change")
    public String update(@RequestBody PersonRest person) {
        return "OK";
    }

}
