package com.landa44.simplerpg.character;

//java dependencies
import java.util.List;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//local dependencies
import com.landa44.simplerpg.attribute.Attribute;
import com.landa44.simplerpg.character.attribute.CharacterAttributes;
import com.landa44.simplerpg.character.attribute.CharacterAttributesRepository;
import com.landa44.simplerpg.character.exception.NullNameException;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;
    private final CharacterAttributesRepository characterAttributesRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository,
                            CharacterAttributesRepository characterAttributesRepository) {
        this.characterRepository = characterRepository;
        this.characterAttributesRepository = characterAttributesRepository;
    }

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }

    public void addCharacter(Character character) throws NullNameException {
        if (character.getName() == null || character.getName().isBlank()) {
            throw new NullNameException();
        }
        characterRepository.save(character);
        characterAttributesRepository.save(
            new CharacterAttributes(100, Attribute.Live, character)
        );
        characterAttributesRepository.save(
            new CharacterAttributes(50, Attribute.Strength, character)
        );
        characterAttributesRepository.save(
            new CharacterAttributes(50, Attribute.Mana, character)
        );
    }
}
