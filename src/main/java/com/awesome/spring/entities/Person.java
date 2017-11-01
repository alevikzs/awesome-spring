package com.awesome.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    public String firstName;

    public String lastName;

    public String email;

}