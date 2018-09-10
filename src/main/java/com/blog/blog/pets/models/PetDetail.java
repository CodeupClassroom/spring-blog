package com.blog.blog.pets.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_details")
public class PetDetail {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "is_sterile")
    private boolean isSterile;

    @Column(name = "personality_description")
    private String personalityDescription;

    @Column(name = "weight_in_ounces")
    private int weightInOunces;

}
