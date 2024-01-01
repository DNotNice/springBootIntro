package com.example.Spring.Intro.service;

import com.example.Spring.Intro.dao.PersonDao;
import com.example.Spring.Intro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
   private  final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao =personDao;
    }

    public int addPerson(Person person){
     return personDao.insertPerson(person);
    }
    public List<Person> getAllPerson(){
        return personDao.selectAllPeople();
    }
    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

}
