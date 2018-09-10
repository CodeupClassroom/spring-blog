package com.blog.blog.pets.repositories;

import com.blog.blog.pets.models.PetDetail;
import org.springframework.data.repository.CrudRepository;

public interface PetDetailRepo extends CrudRepository<PetDetail, Long> {
}
