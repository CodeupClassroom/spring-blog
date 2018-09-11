package com.blog.blog.pets.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chew_toys")
public class ChewToy implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String brand;

    @Column(name = "is_destroyed")
    private boolean destroyed;

    private String description;

    // add relationships, constructors, getters and setters...

}
