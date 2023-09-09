package com.landa44.simplerpg.character;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.landa44.simplerpg.character.attribute.CharacterAttributes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Character represent all type of entities in the game Ex: hereos and enemies.
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
    @OneToMany(mappedBy = "character", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterAttributes> attributes;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
        this.attributes = new ArrayList<>();
    }

    public Character(Long id, String name) {
        this.id = id;
        this.name = name;
        this.attributes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CharacterAttributes> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "Character{"
            + "id=" + id
            + ", name='" + name
            + ", attributes=" + attributes
            + '}';
    }
}
