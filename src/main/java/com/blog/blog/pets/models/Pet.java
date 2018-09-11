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

    // relationships...

    @OneToOne(mappedBy = "pet")
    private PetDetail petDetail;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private List<ChewToy> chewToys;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pets_vets",
            joinColumns={@JoinColumn(name="pet_id")},
            inverseJoinColumns={@JoinColumn(name="vet_id")}
    )
    private List<Vet> vets;

    public Pet() {
    }

    public Pet(String name, int age, String species, PetDetail petDetail, List<ChewToy> chewToys, List<Vet> vets) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.petDetail = petDetail;
        this.chewToys = chewToys;
        this.vets = vets;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public PetDetail getPetDetail() {
        return petDetail;
    }

    public void setPetDetail(PetDetail petDetail) {
        this.petDetail = petDetail;
    }

    public List<ChewToy> getChewToys() {
        return chewToys;
    }

    public void setChewToys(List<ChewToy> chewToys) {
        this.chewToys = chewToys;
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }
}
