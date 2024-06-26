package com.example.versusapi.servicesImpl;

import com.example.versusapi.models.Match;
import com.example.versusapi.repositories.MatchRepository;
import com.example.versusapi.services.MatchServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServicesImpl implements MatchServices {

    @Autowired
    MatchRepository matchRepository;
    @Override
    @Transactional
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public List<Match> getAllMatch() {
        return matchRepository.findAll();
    }

    @Override
    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}
