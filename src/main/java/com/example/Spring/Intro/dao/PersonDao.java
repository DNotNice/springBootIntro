package com.example.Spring.Intro.dao;

import com.example.Spring.Intro.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id , Person person);


    public int insertPerson(Person person);

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id , Person person );
}
