package com.landa44.simplerpg.attribute;

//external dependencies
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Attribute class represent the attributes that a character can have.
 */
@Entity
@Table(name = "attributes")
public class Attribute {
    @Id
    @SequenceGenerator(
        name = "attribute_sequence",
        sequenceName = "attribute_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "attribute_sequence"
    )
    private Long id;
    private String name;

    public Attribute() {
    }

    public Attribute(String name) {
        this.name = name;
    }

    public Attribute(Long id, String name) {
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
        return "Attribute{"
            + "id=" + id
            + ", name='" + name + '\''
            + '}';
    }
}
