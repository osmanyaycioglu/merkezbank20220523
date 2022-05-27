package com.training.spring.person.rest.mappers;

import com.training.spring.person.models.Address;
import com.training.spring.person.models.Person;
import com.training.spring.person.models.Phone;
import com.training.spring.person.rest.models.AddressRest;
import com.training.spring.person.rest.models.PersonRest;
import com.training.spring.person.rest.models.PhoneRest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE  = Mappers.getMapper(PersonMapper.class);

    Person toPerson(PersonRest personRest);

    List<Person> toPersons(List<PersonRest> personRests);

    PersonRest toPersonRest(Person person);

    List<PersonRest> toPersonRests(List<Person> personRests);

    Address toAddress(AddressRest addressRest);

    AddressRest toAddressRest(Address address);

    Phone toPhone(PhoneRest phoneRest);
    PhoneRest toPhoneRest(Phone phone);

    Set<Phone> toPhones(Set<PhoneRest> phoneRests);

    Set<PhoneRest> toPhoneRests(Set<Phone> phones);

}
