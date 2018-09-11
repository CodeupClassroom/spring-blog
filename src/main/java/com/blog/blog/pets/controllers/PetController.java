package com.blog.blog.pets.controllers;

import org.springframework.stereotype.Controller;


@Controller
public class PetController {

//    PetRepo petDao;
//    PetDetailRepo petDetailDao;
//    VetRepo vetDao;
//
//    public PetController(PetRepo petDao, PetDetailRepo petDetailDao, VetRepo vetDao) {
//        this.petDao = petDao;
//        this.petDetailDao = petDetailDao;
//        this.vetDao = vetDao;
//    }

    // pets

//    @GetMapping("/pets")
//    private String petsIndex(Model model) {
//        model.addAttribute("pets", petDao.findAll());
//        return "pets/all-pets";
//    }

//    @GetMapping("/pets/{id}")
//    private String showPet(@PathVariable long id, Model model) {
//        model.addAttribute(petDao.findOne(id));
//        return "pets/show-pet";
//    }

    // pets and details

//    @GetMapping("/pets/{id}/details/create")
//    private String createPetDetails(@PathVariable long id, Model model) {
//        model.addAttribute("id", id);
//        model.addAttribute("petDetail", new PetDetail());
//        return "pets/details-create";
//    }
//
//    @PostMapping("/pets/{id}/details/create")
//    private String insertPetDetails(@PathVariable long id, @ModelAttribute PetDetail petDetail) {
//        petDetail.setPet(petDao.findOne(id));
//        petDetailDao.save(petDetail);
//        return "redirect:/pets/" + id;
//    }
//
//
//    @GetMapping("/pets/{id}/details/edit")
//    private String editPetDetails(@PathVariable long id, Model model) {
//        model.addAttribute("petDetail", petDetailDao.findOne(id));
//        return "pets/details-create";
//    }
//
//    @PostMapping("/pets/{id}/details/edit")
//    private String updatePetDetails(@PathVariable long id, @ModelAttribute PetDetail petDetail) {
//        petDetail.setPet(petDao.findOne(id));
//        petDetailDao.save(petDetail);
//        return "redirect:/pets/" + id;
//    }
//
//    @PostMapping("/pets/{id}/details/delete")
//    private String deletePetDetails(@PathVariable long id) {
//        petDetailDao.delete(id);
//        return "redirect:/pets/" + id;
//    }

    // pets and vets

//    @GetMapping("/pets/{id}/vets/edit")
//    private String editPetVets(@PathVariable long id, Model model) {
//        model.addAttribute("vets", vetDao.findAll());
//        model.addAttribute("pet", petDao.findOne(id));
//        return "pets/vet-edit";
//    }
//
//    @PostMapping("/pets/{id}/vets/edit")
//    private String updatePetVets(@PathVariable Long id, @ModelAttribute Pet formPet) {
//        Pet pet = petDao.findOne(id);
//        pet.setVets(formPet.getVets());
//        petDao.save(pet);
//        return "redirect:/pets/" + pet.getId();
//    }

}
