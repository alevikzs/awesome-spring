package com.awesome.spring.controllers;

import com.awesome.spring.entities.Person;
import com.awesome.spring.repositories.PersonsRepository;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonsRepository personsRepository;

    public PersonController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons")
    public Iterable<Person> all() {
        return personsRepository.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person one(@PathVariable("id") long id) {
        return personsRepository.findOne(id);
    }

    @PostMapping("/persons")
    public Person post(@RequestBody Person person) {
        personsRepository.save(person);

        return person;
    }

    @PutMapping("/persons")
    public Person put(@RequestBody Person person) {
        if (personsRepository.exists(person.id)) {
            personsRepository.save(person);
        }

        return person;
    }

    @DeleteMapping("/persons/{id}")
    public void delete(@PathVariable("id") long id) {
        if (personsRepository.exists(id)) {
            personsRepository.delete(id);
        }
    }

}