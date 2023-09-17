package com.landa44.simplerpg.hero;

//java dependencies
import java.util.List;
import java.util.Optional;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//local dependencies
import com.landa44.simplerpg.character.CharacterService;
import com.landa44.simplerpg.hero.exception.HeroNotFoundException;

@Service
public class HeroService {
    private final HeroRepository heroRepository;
    private final CharacterService characterService;

    @Autowired
    public HeroService(HeroRepository heroRepository,
                       CharacterService characterService) {
        this.heroRepository = heroRepository;
        this.characterService = characterService;
    }

    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    public void addNewHero(Hero hero) {
        characterService.addCharacter(hero.getCharacter());
        heroRepository.save(hero);
    }

    public Hero getHero(Long id) {
        Optional<Hero> optionalHero = heroRepository.findById(id);

        return optionalHero.orElseThrow(() -> new HeroNotFoundException(
            "Hero with id:" + id + " does not exist"
        ));
    }

    public void deleteHero(Long id) {
        if (!heroRepository.existsById(id)) {
            throw new HeroNotFoundException(
                "Hero with id:" + id + " does not exist"
            );
        }

        heroRepository.deleteById(id);
    }
}
