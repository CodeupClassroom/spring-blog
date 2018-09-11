package com.blog.blog.pets.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pet_details")
public class PetDetail implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "is_sterile")
    private boolean sterile;

    @Column(name = "personality_description")
    private String personalityDescription;

    @Column(name = "weight_in_ounces")
    private int weightInOunces;

    // add relationships, constructors, getters and setters...

}
