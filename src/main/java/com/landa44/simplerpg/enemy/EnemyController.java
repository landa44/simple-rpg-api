package com.landa44.simplerpg.enemy;

import com.landa44.simplerpg.character.Character;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for managing Enemy-related API endpoints.
 */
@RestController
@RequestMapping(path = "rpg/v1/enemies")
public class  EnemyController {
    private final EnemyService EnemyService;

    @Autowired
    public EnemyController(EnemyService EnemyService) {
        this.EnemyService = EnemyService;
    }

    @GetMapping
    public List<Enemy> getEnemies() {
        return EnemyService.getEnemies();
    }

    @PostMapping
    public void registerNewEnemy(@RequestBody Character character) {
        EnemyService.addNewEnemy(new Enemy(character));
    }

    @GetMapping("/{id}")
    public Enemy getEnemy(@PathVariable Long id) {
        return EnemyService.getEnemy(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnemy(@PathVariable Long id) {
        EnemyService.deleteEnemy(id);
    }
}
