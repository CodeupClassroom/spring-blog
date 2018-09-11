package com.blog.blog.pets.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "pets")
public class Pet implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 50, nullable = false)
    private String name;

    private int age;

    private String species;

    // add relationships, constructors, getters and setters...


}
