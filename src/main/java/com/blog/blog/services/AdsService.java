package com.blog.blog.services;

import com.blog.blog.Ad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdsService {
    private List<Ad> ads;

    public AdsService(){
        ads = new ArrayList<>();
        createAds();
    }

    public Ad save(Ad ad){
        ad.setId(ads.size() + 1);
        ads.add(ad);
        return ad;
    }

    public Ad findOne(long id){
        return ads.get((int)id - 1);
    }

    public List<Ad> findAll(){
        return ads;
    }

    private void createAds() {
        ads.add(new Ad("PS4", "brand new"));
        ads.add(new Ad("XBOX360", "used"));
        ads.add(new Ad("Switch", "1 month of use"));
    }


}
