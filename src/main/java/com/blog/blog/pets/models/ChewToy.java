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

    private boolean destroyed;

    private String description;

    // relationships...

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public ChewToy() {
    }

    public ChewToy(String name, String brand, boolean destroyed, String description, Pet pet) {
        this.name = name;
        this.brand = brand;
        this.destroyed = destroyed;
        this.description = description;
        this.pet = pet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        destroyed = destroyed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
