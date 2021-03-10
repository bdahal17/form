package com.example.form.controller;

import com.example.form.model.Person;
import com.example.form.repository.PersonStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
    @Autowired
    private PersonStorage personStorage;

    public PersonController(PersonStorage personStorage) {
        this.personStorage = personStorage;
    }

    @GetMapping("/index")
    public String getMessage() {
        return "index";
    }
   @PostMapping("add/post")
    public String postMessage(String first, String last, String message ) {
       Person person1 = new Person(first, last, message);
       personStorage.savePerson(person1);
        return "redirect:/index";
    }

}
