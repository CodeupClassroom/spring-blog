package com.blog.blog.pets.models;


import javax.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 50, nullable = false)
    private String name;

    private int age;

    private String species;

    // relationships...

}
