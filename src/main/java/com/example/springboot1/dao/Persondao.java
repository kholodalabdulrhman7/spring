package com.example.springboot1.dao;

import com.example.springboot1.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Persondao {

    int insertPerson(UUID id , Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id , Person person);

    Optional<Person> selectPersonById();

}
