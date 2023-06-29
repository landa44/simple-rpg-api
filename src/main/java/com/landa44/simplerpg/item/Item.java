package com.landa44.simplerpg.item;

import com.landa44.simplerpg.hero.Hero;
import jakarta.persistence.*;

@Entity
@Table
public class Item {
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
    private long id;
    private String name;
    private Integer attack;
    private Integer defense;
    private Double price;
    @ManyToOne
    @JoinColumn(name="hero_id")
    private Hero hero;

    public Item(String name, Integer attack, Integer defense, double price) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
