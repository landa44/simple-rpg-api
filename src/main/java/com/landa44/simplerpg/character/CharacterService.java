package com.landa44.simplerpg.character;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class that provides operations related to Characters management.
 */
@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }
}
