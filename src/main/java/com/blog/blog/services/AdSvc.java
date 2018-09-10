package com.blog.blog.services;

import com.blog.blog.models.Ad;
import com.blog.blog.repositories.AdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdSvc {

    AdRepository adDao;

    public AdSvc(AdRepository adDao) {
        this.adDao = adDao;
    }

    public List<Ad> giveMeAds() {
        return adDao.findAll();
    }
}
