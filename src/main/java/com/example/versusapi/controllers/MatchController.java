package com.example.versusapi.controllers;

import com.example.versusapi.dto.MatchRequestDTO;
import com.example.versusapi.dto.MatchResponseDTO;
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
    public Match createMatch(@RequestBody MatchRequestDTO dto) {
        Match match = new Match(dto);
        return matchServices.saveMatch(match);
    }

    @GetMapping
    public List<MatchResponseDTO> getAll() {
        List<MatchResponseDTO> matchList = matchServices.getAllMatch().stream().map(MatchResponseDTO::new).toList();
        return matchList;
    }
}
