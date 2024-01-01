package com.example.Spring.Intro.dao;

import com.example.Spring.Intro.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class PersonDataAccessService implements  PersonDao{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
    @Override
    public int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id , person);
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();

    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> person = selectPersonById(id);
        if(person == null) return -1;
        else {
            for( Person i : DB)if(Objects.equals(i.getName(), person.toString()))
        }

    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }

}
