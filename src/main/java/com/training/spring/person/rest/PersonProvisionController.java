package com.training.spring.person.rest;

import com.training.spring.person.models.Person;
import com.training.spring.person.rest.error.ErrorObj;
import com.training.spring.person.rest.mappers.PersonMapper;
import com.training.spring.person.rest.models.PersonRest;
import com.training.spring.person.services.PersonProvisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/person/provision")
@Validated
public class PersonProvisionController {

    @Autowired
    private PersonProvisionService pps;

    @PostMapping("/activate")
    public String activate(@Validated @RequestBody PersonRest person) {
        if (person.getName().equals("osman") ){
            throw new IllegalArgumentException("name osman olamaz");
        }
        long pid = pps.activate(PersonMapper.INSTANCE.toPerson(person));
        return "Person id : " + pid + " activated";
    }

    @GetMapping("/deactivate/{pid}")
    public String deactivate(@NotNull @PathVariable("pid") Long personId) {
        return "OK";
    }


}
