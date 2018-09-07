package com.blog.blog.controllers;

import com.blog.blog.Ad;
import com.blog.blog.services.AdsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdsController {

   private final AdsService adsSvc;

   public AdsController(AdsService adsSvc){
       this.adsSvc = adsSvc;
   }

    @GetMapping("/ads/{id}")
    public String showAd(@PathVariable long id, Model vModel){
        Ad ad = adsSvc.findOne(id);
        vModel.addAttribute("ad", ad);
        return "ads/show";
    }

    @GetMapping("/ads")
    public String showAllAds(Model vModel){
       vModel.addAttribute("ads", adsSvc.findAll());
       return "ads/index";
    }

    @GetMapping("/ads/create")
    public String showCreateForm(){
       return "ads/create";
    }

    @PostMapping("ads/save")
    public String createAd(@RequestParam(name = "title") String title, @RequestParam(name = "desc") String description){
       Ad ad = adsSvc.save(new Ad(title, description));
       return "redirect:/ads";
    }

}
