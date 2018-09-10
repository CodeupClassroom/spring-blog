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

    @OneToOne
    private Pet pet;

    public PetDetail() {
    }

    public PetDetail(boolean sterile, String personalityDescription, int weightInOunces, Pet pet) {
        this.sterile = sterile;
        this.personalityDescription = personalityDescription;
        this.weightInOunces = weightInOunces;
        this.pet = pet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getSterile() {
        return sterile;
    }

    public void setSterile(boolean sterile) {
        sterile = sterile;
    }

    public String getPersonalityDescription() {
        return personalityDescription;
    }

    public void setPersonalityDescription(String personalityDescription) {
        this.personalityDescription = personalityDescription;
    }

    public int getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(int weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
