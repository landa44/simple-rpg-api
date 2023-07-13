package com.landa44.simplerpg.hero;

import com.landa44.simplerpg.character.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HeroService {
    private final HeroRepository heroRepository;
    private final CharacterRepository characterRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository, CharacterRepository characterRepository) {
        this.heroRepository = heroRepository;
        this.characterRepository = characterRepository;
    }

    public List<Hero> getHeroes(){
        return heroRepository.findAll();
    }

    public void addNewHero(Hero hero){
        characterRepository.save(hero.getCharacter());
        heroRepository.save(hero);
    }

    public Hero getHero(Long id) {
        Optional<Hero> optionalHero = heroRepository.findById(id);
        return optionalHero.orElse(null);
    }
}
