package com.blog.blog.pets.repositories;

import com.blog.blog.pets.models.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepo extends CrudRepository<Vet, Long> {
}
