package com.blog.blog.pets.controllers;

import com.blog.blog.pets.models.PetDetail;
import com.blog.blog.pets.repositories.PetDetailRepo;
import com.blog.blog.pets.repositories.PetRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PetController {


    PetRepo petDao;
    PetDetailRepo petDetailDao;

    public PetController(PetRepo petDao, PetDetailRepo petDetailDao) {
        this.petDao = petDao;
        this.petDetailDao = petDetailDao;
    }

    @GetMapping("/pets")
    private String petsIndex(Model model) {
        model.addAttribute("pets", petDao.findAll());
        return "pets/all-pets";
    }

    @GetMapping("/pets/{id}")
    private String showPet(@PathVariable long id, Model model) {
        model.addAttribute(petDao.findOne(id));
        return "pets/show-pet";
    }

    @GetMapping("/pets/{id}/details/create")
    private String createPetDetails(@PathVariable long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("petDetail", new PetDetail());
        return "pets/details-create";
    }

    @PostMapping("/pets/{id}/details/create")
    private String insertPetDetails(@PathVariable long id, @ModelAttribute PetDetail petDetail) {
        petDetail.setPet(petDao.findOne(id));
        petDetailDao.save(petDetail);
        return "redirect:/pets/" + id;
    }


    @GetMapping("/pets/{id}/details/edit")
    private String editPetDetails(@PathVariable long id, Model model) {
        model.addAttribute("petDetail", petDetailDao.findOne(id));
        return "pets/details-create";
    }

    @PostMapping("/pets/{id}/details/edit")
    private String updatePetDetails(@PathVariable long id, @ModelAttribute PetDetail petDetail) {
        petDetail.setPet(petDao.findOne(id));
        petDetailDao.save(petDetail);
        return "redirect:/pets/" + id;
    }

    @PostMapping("/pets/{id}/details/delete")
    private String deletePetDetails(@PathVariable long id) {
        petDetailDao.delete(id);
        return "redirect:/pets/" + id;
    }

}
