package com.training.spring.person.rest.mappers;

import com.training.spring.person.models.Person;
import com.training.spring.person.rest.models.PersonRest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE  = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonRest personRest);

    List<Person> toPersons(List<PersonRest> personRests);

    PersonRest toPersonRest(Person person);

    List<PersonRest> toPersonRests(List<Person> personRests);

}
