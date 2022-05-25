package com.training.spring.person.data;

import com.training.spring.person.models.Person;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonDataStorage {
    private Map<Long, Person> personMap = new ConcurrentHashMap<>();
    private AtomicLong personId = new AtomicLong(0);

    public long insert(Person person){
        long pid = personId.incrementAndGet();
        person.setPersonId(pid);
        personMap.put(pid,person);
        return pid;
    }

    public Person getPerson(long personId){
        return personMap.get(personId);
    }

    public List<Person> getAll(){
        return new ArrayList<>(personMap.values());
    }

    public List<Person> getPersonBySurname(String surname){
        List<Person> personList = new ArrayList<>();
        Collection<Person> values = personMap.values();
        for (Person per:values) {
            if (per.getSurname().equalsIgnoreCase(surname)){
                personList.add(per);
            }
        }
        return personList;
    }

}
