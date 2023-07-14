package com.geekster.URLHitCounter.controller;

import com.geekster.URLHitCounter.model.UrlHitCounter;
import com.geekster.URLHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    UrlHitService hitService;

    @GetMapping("count")
    public List<UrlHitCounter> getAllCount(){

        List<UrlHitCounter> countList = hitService.getAllCountList();

        return countList;
    }
}
