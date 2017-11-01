package com.awesome.spring.repositories;

import com.awesome.spring.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonsRepository extends CrudRepository<Person, Long> {

}
