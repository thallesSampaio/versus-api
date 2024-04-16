package com.example.versusapi.servicesImpl;

import com.example.versusapi.models.Match;
import com.example.versusapi.repositories.MatchRepository;
import com.example.versusapi.services.MatchServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServicesImpl implements MatchServices {

    @Autowired
    MatchRepository matchRepository;
    @Override
    @Transactional
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }
}
