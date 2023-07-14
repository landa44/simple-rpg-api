package com.landa44.simplerpg.character;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Characther represent all type of entities in the game Ex: hereos and enemies.
 */
@Entity
@Table(name = "characters")
public class Character {
    @Id
    @SequenceGenerator(
        name = "character_sequence",
        sequenceName = "character_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "character_sequence"
    )
    private Long id;
    private String name;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{"
            + "id=" + id
            + ", name='" + name + '\''
            + '}';
    }
}
