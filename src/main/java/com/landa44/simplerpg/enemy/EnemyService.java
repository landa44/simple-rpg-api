package com.landa44.simplerpg.enemy;

//java dependencies
import java.util.List;
import java.util.Optional;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//local dependencies
import com.landa44.simplerpg.character.CharacterService;
import com.landa44.simplerpg.enemy.exception.EnemyNotFoundException;

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
