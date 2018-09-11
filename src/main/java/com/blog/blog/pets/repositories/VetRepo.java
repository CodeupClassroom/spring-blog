package com.blog.blog.pets.repositories;

import com.blog.blog.pets.models.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetRepo extends CrudRepository<Vet, Long> {

    List<Vet> findAll();

}
