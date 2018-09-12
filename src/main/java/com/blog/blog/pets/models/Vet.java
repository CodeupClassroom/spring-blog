package com.blog.blog.pets.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "vets")
public class Vet implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToMany(mappedBy = "vets")
    private List<Pet> pets;

    public Vet() {
    }

    public Vet(String name, String address, String phoneNumber, List<Pet> pets) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pets = pets;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
