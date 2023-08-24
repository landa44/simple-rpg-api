package com.landa44.simplerpg.character;

import com.landa44.simplerpg.attribute.AttributeService;
import com.landa44.simplerpg.character.attribute.CharacterAttributes;
import com.landa44.simplerpg.character.attribute.CharacterAttributesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;
    private final AttributeService attributeService;
    private final CharacterAttributesRepository characterAttributesRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository,
                            AttributeService attributeService,
                            CharacterAttributesRepository characterAttributesRepository) {
        this.characterRepository = characterRepository;
        this.attributeService = attributeService;
        this.characterAttributesRepository = characterAttributesRepository;
    }

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }

    public void addCharacter(Character character) {
        characterRepository.save(character);
        characterAttributesRepository.save(
            new CharacterAttributes(100, attributeService.getLifeAttribute(), character)
        );
        characterAttributesRepository.save(
            new CharacterAttributes(50, attributeService.getStrengthAttribute(), character)
        );
        characterAttributesRepository.save(
            new CharacterAttributes(50, attributeService.getManaAttribute(), character)
        );
    }
}
