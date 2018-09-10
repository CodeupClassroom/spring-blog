package com.blog.blog.pets.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chew_toys")
public class ChewToy {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String brand;

    private boolean isDestroyed;

    private String description;

    // relationships...




}
