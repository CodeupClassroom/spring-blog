package com.blog.blog.repositories;

import com.blog.blog.models.Ad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdRepository extends CrudRepository<Ad, Long> {

    List<Ad> findAll();


    List<Ad> findByTitleContainingOrDescriptionContaining(String string1, String string2);

}
