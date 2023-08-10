package com.landa44.simplerpg.character;

import com.landa44.simplerpg.hero.Hero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for managing character-related API endpoints.
 */
@RestController
@RequestMapping(path = "rpg/v1/characters")
public class CharacterController {
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getHeroes() {
        return characterService.getCharacters();
    }
}
