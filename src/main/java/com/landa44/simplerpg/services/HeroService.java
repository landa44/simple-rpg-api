package com.landa44.simplerpg.services;
import com.landa44.simplerpg.models.Hero;
import com.landa44.simplerpg.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> getHeroes(){
        return heroRepository.findAll();
    }
}
