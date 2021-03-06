package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


    @GetMapping(value="/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies(){
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/whiskies/")
    public ResponseEntity<List<Whisky>> findWhiskiesForAGivenYear(
            @RequestParam(name="year") int year){
        return new ResponseEntity<>(whiskyRepository.findWhiskiesByYear(year), HttpStatus.OK);
    }

//    @GetMapping(value="/whiskies/")
//    public ResponseEntity<List<Whisky>> findWhiskiesByDistillery_idAndAge(
//            @RequestParam(name="distillery_id") long distillery_id,
//            @RequestParam(name="age") int age) {
//        return new ResponseEntity<>(whiskyRepository.findWhiskyByDistillery_idAndAge(distillery_id, age), HttpStatus.OK);
//    }


}
