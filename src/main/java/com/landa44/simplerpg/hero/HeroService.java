package com.landa44.simplerpg.hero;
import com.landa44.simplerpg.hero.Hero;
import com.landa44.simplerpg.hero.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addNewHero(Hero hero){
        heroRepository.save(hero);
    }
}
