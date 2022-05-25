package com.training.spring.person.services;

import com.training.spring.person.dataaccess.PersonDataAccess;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonQueryService {

    @Autowired
    private PersonDataAccess pda;

    public Person getOnePerson(long personId){
        return pda.getOnePerson(personId);
    }

    public List<Person> getAll(){
        return pda.getAll();
    }

    public List<Person> getPersonBySurname(String surname){
        return pda.getPersonBySurname(surname);
    }

}
