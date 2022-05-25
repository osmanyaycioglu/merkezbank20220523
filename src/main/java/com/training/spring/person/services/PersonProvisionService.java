package com.training.spring.person.services;

import com.training.spring.person.dataaccess.PersonDataAccess;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonProvisionService {

    @Autowired
    private PersonDataAccess personDataAccess;
    public long activate(Person person){
        return personDataAccess.insert(person);
    }

}
