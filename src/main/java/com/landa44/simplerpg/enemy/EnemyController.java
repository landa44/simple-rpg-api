package com.landa44.simplerpg.enemy;

//local dependencies
import com.landa44.simplerpg.character.Character;

//local dependencies
import java.util.List;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rpg/v1/enemies")
public class  EnemyController {
    private final EnemyService enemyService;

    @Autowired
    public EnemyController(EnemyService enemyService) {
        this.enemyService = enemyService;
    }

    @GetMapping
    public List<Enemy> getEnemies() {
        return enemyService.getEnemies();
    }

    @PostMapping
    public void registerNewEnemy(@RequestBody Character character) {
        enemyService.addNewEnemy(new Enemy(character));
    }

    @GetMapping("/{id}")
    public Enemy getEnemy(@PathVariable Long id) {
        return enemyService.getEnemy(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnemy(@PathVariable Long id) {
        enemyService.deleteEnemy(id);
    }
}
