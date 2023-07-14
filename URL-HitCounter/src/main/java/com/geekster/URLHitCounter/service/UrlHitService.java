package com.geekster.URLHitCounter.service;

import com.geekster.URLHitCounter.model.UrlHitCounter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlHitService {

    List<UrlHitCounter> countList = new ArrayList<>();

    // Initial count value of hit
    Integer countValue = 0;

    public List<UrlHitCounter> getAllCountList(){
        UrlHitCounter visitor = new UrlHitCounter();
        countValue++;

        countList.add(new UrlHitCounter("visitor", countValue));

        return countList;
    }
}
