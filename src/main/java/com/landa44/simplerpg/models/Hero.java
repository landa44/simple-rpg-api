package com.landa44.simplerpg.models;

import jakarta.persistence.*;

@Entity
@Table
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
    private String name;
    private Integer life;
    private Integer attack;
    private Integer defense;

    public Hero() {
    }

    public Hero(Long id, String name, Integer life, Integer attack, Integer defense) {
        this.id = id;
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public Hero(String name, Integer life, Integer attack, Integer defense) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
