package com.landa44.simplerpg.enemy;

import com.landa44.simplerpg.character.Character;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Enemy class represents the playable characters.
 */
@Entity
@Table(name = "enemies")
public class Enemy {
    @Id
    @SequenceGenerator(
        name = "enemy_sequence",
        sequenceName = "enemy_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "enemy_sequence"
    )
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id")
    private Character character;

    public Enemy() {
    }

    public Enemy(Character character) {
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Enemy{"
            + "id=" + id
            + ", character=" + character
            + '}';
    }
}
