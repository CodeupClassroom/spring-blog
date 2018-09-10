package com.blog.blog.controllers;

import com.blog.blog.models.Ad;
import com.blog.blog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JpaTestController {

    AdRepository adDao;

    public JpaTestController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/jpa/find")
    @ResponseBody
    public String jpaFindTest() {
        return adDao.findOne(2L).toString();
    }

    @GetMapping("/jpa/findall")
    @ResponseBody
    public String jpaFindAllTest() {
        List<Ad> ads = adDao.findAll();
        String output = "";
        for (Ad ad : ads) {
            output += ad.toString() + "<br>";
        }
        return output;
    }

    @GetMapping("/jpa/create")
    @ResponseBody
    public String jpaCreateTest() {
        Ad ad = new Ad("New Ad", "This is a brand new ad");
        adDao.save(ad);
        return jpaFindAllTest();
    }

    @GetMapping("/jpa/update")
    @ResponseBody
    public String jpaUpdateTest() {
        Ad ad = new Ad(3,"Update Ad", "This is a updated ad");
        adDao.save(ad);
        return jpaFindAllTest();
    }

    @GetMapping("/jpa/delete")
    @ResponseBody
    public String jpaDeleteTest() {
        adDao.delete(3L);
        return jpaFindAllTest();
    }

    @GetMapping("/jpa/search")
    @ResponseBody
    public String jpaSearchTest() {

        List<Ad> ads = adDao.findByTitleContainingOrDescriptionContaining("Sega", "Sega");

        String output = "";
        for (Ad ad : ads) {
            output += ad.toString() + "<br>";
        }

        return output;
    }

}
