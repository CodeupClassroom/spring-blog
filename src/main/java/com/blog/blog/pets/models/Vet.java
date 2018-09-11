package com.blog.blog.pets.models;
import javax.persistence.*;


@Entity
@Table(name = "vets")
public class Vet {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    // add relationships, constructors, getters and setters...
}
