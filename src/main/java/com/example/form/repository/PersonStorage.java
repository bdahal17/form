package com.example.form.repository;

import com.example.form.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonStorage {
    private PersonRepository personRepository;

    public PersonStorage(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
