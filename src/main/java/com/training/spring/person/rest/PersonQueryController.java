package com.training.spring.person.rest;

import com.training.spring.person.dataaccess.PersonDataAccess;
import com.training.spring.person.models.Person;
import com.training.spring.person.rest.mappers.PersonMapper;
import com.training.spring.person.rest.models.PersonRest;
import com.training.spring.person.services.PersonQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/person/query")
public class PersonQueryController {

    @Autowired
    private PersonQueryService pqs;

    @GetMapping("/get/one")
    public PersonRest getOne(@RequestParam("pid") Long personId){
        return PersonMapper.INSTANCE.toPersonRest(pqs.getOnePerson(personId));
    }

    @GetMapping("/get/all")
    public List<PersonRest> getAll(){
        return PersonMapper.INSTANCE.toPersonRests(pqs.getAll());
    }

    @GetMapping("/get/by/surname")
    public List<PersonRest> getOne(@RequestParam("surname") String surname){
        return PersonMapper.INSTANCE.toPersonRests(pqs
                                                           .getPersonBySurname(surname));
    }


}
