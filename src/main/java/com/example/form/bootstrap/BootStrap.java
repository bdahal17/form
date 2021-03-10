package com.example.form.bootstrap;

import com.example.form.model.Person;
import com.example.form.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepository;

    public BootStrap(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person("bishnu", "dahal", "hello guys!");
        Person person1 = new Person("ram", "dahal", "nope");
        Person person2 = new Person("tara", "dahal", "good job");
        Person person3 = new Person("tulshi", "dahal", "wow");
        personRepository.save(person);
        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);

    }
}
