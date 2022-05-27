package com.training.spring.person.dataaccess;

import com.training.spring.person.data.PersonDataStorage;
import com.training.spring.person.data.PersonDbDataStorage;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PersonDataAccess {

    @Autowired
    private PersonDbDataStorage personDataStorage;

    public long insert(Person person){
        return personDataStorage.insert(person);
    }

    public Person getOnePerson(long personId){
        return personDataStorage.getPerson(personId);
    }

    public List<Person> getAll(){
        return personDataStorage.getAll();
    }

    public List<Person> getPersonBySurname(String surname){
        return personDataStorage.getPersonBySurname(surname);
    }

}
