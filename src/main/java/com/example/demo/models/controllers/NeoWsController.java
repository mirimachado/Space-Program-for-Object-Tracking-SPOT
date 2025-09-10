package com.example.demo.models.controllers;

import com.example.demo.models.dtos.NeoFeedResponse;
import com.example.demo.models.entities.Asteroid;
import com.example.demo.models.services.NeoWsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/neo")
public class NeoWsController {

    @Autowired
    private final NeoWsService neoWsService;

    @GetMapping("/feed")
    public Mono<NeoFeedResponse> getNeoFeed(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){

        return neoWsService.getNeoFeed(startDate, endDate);
    }


    @GetMapping("/lookup/{asteroidId}")
    public Mono<Asteroid> getNeoLookup(@PathVariable String asteroidId){
        return neoWsService.getNeoLookup(asteroidId);
    }


    @GetMapping("/browse")
    public Mono<NeoBrowseResponse> browseNeo(){
        return neoWsService.browseNeo();
    }
}
