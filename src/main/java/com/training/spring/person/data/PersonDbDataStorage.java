package com.training.spring.person.data;

import com.training.spring.jpa.IPersonDao;
import com.training.spring.person.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonDbDataStorage {

    @Autowired
    private IPersonDao personDao;
//    @PersistenceUnit
//    private EntityManagerFactory entityManagerFactory;
//
//    @Transactional
//    public long insertEntity(Person person){
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.joinTransaction();
//        entityManager.getTransaction().begin();
//        try {
//            entityManager.persist(person);
//            entityManager.getTransaction().commit();
//        }catch (Exception exp) {
//            entityManager.getTransaction().rollback();
//        }
//        return person.getPersonId();
//    }

    public long insert(Person person){
        Person save = personDao.save(person);
        return save.getPersonId();
    }

    public Person getPerson(long personId){
        Optional<Person> person = personDao.findById(personId);
        return person.orElse(null);
    }

    public List<Person> getAll(){
        List<Person> personList = new ArrayList<>();
        Iterable<Person> all = personDao.findAll();
        for (Person person:all) {
            personList.add(person);
        }
        return personList;
    }

    public List<Person> getPersonBySurname(String surname){
        return personDao.findBySurname(surname);
    }

}
