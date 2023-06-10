package com.landa44.simplerpg.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "rpg/v1/heroes")
public class  HeroController {
    private final HeroService heroService;
    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<Hero> getHeroes(){
        return heroService.getHeroes();
    }

    @PostMapping
    public void registerNewHero(@RequestBody Hero hero){
        heroService.addNewHero(hero);
    }
}
