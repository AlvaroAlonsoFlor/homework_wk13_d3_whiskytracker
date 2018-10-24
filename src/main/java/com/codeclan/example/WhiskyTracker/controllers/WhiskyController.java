package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "{year}")
    public List<Whisky> getWhiskiesInYear(@PathVariable int year) {
        return whiskyRepository.allWhiskiesInYear(year);
    }

    @GetMapping(value = "region/{region}")
    public List<Whisky> getWhiskiesInRegion(@PathVariable String region) {
        return whiskyRepository.allWhiskyInRegion(region);
    }


}
