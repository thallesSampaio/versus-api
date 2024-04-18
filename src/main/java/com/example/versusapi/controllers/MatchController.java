package com.example.versusapi.controllers;

import com.example.versusapi.models.*;
import com.example.versusapi.services.MatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("match")
public class MatchController {

    @Autowired
    MatchServices matchServices;

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchServices.saveMatch(match);
    }
}
