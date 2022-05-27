package com.training.spring.jpa;

import com.training.spring.person.models.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonDao extends CrudRepository<Person,Long> {

    List<Person> findBySurname(String surname);
    List<Person> findBySurnameAndName(String surname,String name);
    List<Person> findBySurnameLike(String surnamePart);
    List<Person> findBySurnameIn(List<String> surname);
    List<Person> findBySurnameOrderBySurname(String surname);

    @Query("select p from Person p where p.surname=?1")
    List<Person> searchSurname(String surname);

    @Query("select p from Person p where p.surname=?1 and p.name=?2")
    List<Person> araSurnameAndName(String surname,String name);

    @Query("select p from Person p where p.surname=:soy and p.name=:isim")
    List<Person> araSurnameAndName2(@Param("soy") String surname,@Param("isim") String name);

    @Query(value = "select * from kisi p where p.surname=?1 and p.name=?2",nativeQuery = true)
    List<Person> araSurnameAndNameNative(String surname,String name);

    @Query("select p.height,p.weight from Person p where p.surname=:soy and p.name=:isim")
    List<Object[]> araSurnameAndName3(@Param("soy") String surname,@Param("isim") String name);

}



