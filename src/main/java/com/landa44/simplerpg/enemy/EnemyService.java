package com.landa44.simplerpg.enemy;

import com.landa44.simplerpg.character.CharacterRepository;
import com.landa44.simplerpg.character.CharacterService;
import com.landa44.simplerpg.enemy.exception.EnemyNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnemyService {
    private final EnemyRepository enemyRepository;
    private final CharacterService characterService;

    @Autowired
    public EnemyService(EnemyRepository enemyRepository,
                        CharacterService characterService) {
        this.enemyRepository = enemyRepository;
        this.characterService = characterService;
    }

    public List<Enemy> getEnemies() {
        return enemyRepository.findAll();
    }

    public void addNewEnemy(Enemy enemy) {
        characterService.addCharacter(enemy.getCharacter());
        enemyRepository.save(enemy);
    }

    public Enemy getEnemy(Long id) {
        Optional<Enemy> optionalEnemy = enemyRepository.findById(id);

        return optionalEnemy.orElseThrow(() -> new EnemyNotFoundException(
            "Enemy with id:" + id + " does not exist"
        ));
    }

    public void deleteEnemy(Long id) {
        if (!enemyRepository.existsById(id)) {
            throw  new EnemyNotFoundException(
                "Enemy with id:" + id + " does not exist"
            );
        }

        enemyRepository.deleteById(id);
    }
}
