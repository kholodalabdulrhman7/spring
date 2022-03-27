package com.example.springboot1.service;

import com.example.springboot1.Model.Person;
import com.example.springboot1.dao.Persondao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private  final Persondao persondao ;
@Autowired
    public PersonService(@Qualifier("fakeDao") Persondao persondao) {
        this.persondao = persondao;
    }

    public int addPerson(Person person){
        return persondao.insertPerson(person);
    }
public List<Person> getAllPeople(){
    return persondao.selectAllPeople();
}

public Optional<Person> getPersonById(UUID id){
    return persondao.selectPersonById();
}

}
