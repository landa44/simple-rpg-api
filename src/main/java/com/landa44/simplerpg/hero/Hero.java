package com.landa44.simplerpg.hero;

//local dependencies
import com.landa44.simplerpg.character.Character;

//external dependencies
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
 * Hero class represents the playable characters.
 */
@Entity
@Table(name = "heroes")
@JsonSerialize(using = HeroSerializer.class)
public class Hero {
    @Id
    @SequenceGenerator(
        name = "hero_sequence",
        sequenceName = "hero_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "hero_sequence"
    )
    private Long id;
    private int money;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id")
    private Character character;

    public Hero() {
    }

    public Hero(Character character) {
        this.money = 50;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Hero{"
            + "id=" + id
            + ", money=" + money
            + ", character=" + character
            + '}';
    }
}
