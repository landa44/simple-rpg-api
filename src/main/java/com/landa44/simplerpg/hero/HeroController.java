package com.landa44.simplerpg.hero;

import com.landa44.simplerpg.character.Character;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for managing hero-related API endpoints.
 */
@RestController
@RequestMapping(path = "rpg/v1/heroes")
public class  HeroController {
    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<Hero> getHeroes() {
        return heroService.getHeroes();
    }

    @PostMapping
    public void registerNewHero(@RequestBody Character character) {
        heroService.addNewHero(new Hero(character));
    }

    @GetMapping("/{id}")
    public Hero getHero(@PathVariable Long id) {
        return heroService.getHero(id);
    }
}
