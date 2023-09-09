package com.landa44.simplerpg.character.attribute;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.landa44.simplerpg.attribute.Attribute;
import com.landa44.simplerpg.character.Character;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * A class to store the value of the character's attributes.
 * Represents the relationship between character and attribute.
 */
@Entity
@Table(name = "character_attributes")
@JsonSerialize(using = CharacterAttributesSerializer.class)
public class CharacterAttributes {
    @Id
    @SequenceGenerator(
        name = "character_attributes_sequence",
        sequenceName = "character_attributes_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "character_attributes_sequence"
    )
    private Long id;
    private int value;
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;

    public CharacterAttributes() {
    }

    public CharacterAttributes(int value, Attribute attribute, Character character) {
        this.value = value;
        this.attribute = attribute;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "CharacterAttributes{"
            + "attribute=" + attribute.getName()
            + ", value=" + value
            + '}';
    }
}
