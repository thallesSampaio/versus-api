package com.example.versusapi.controllers;

import com.example.versusapi.models.Match;
import com.example.versusapi.services.MatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
