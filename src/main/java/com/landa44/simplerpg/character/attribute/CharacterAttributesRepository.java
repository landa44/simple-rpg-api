package com.landa44.simplerpg.character.attribute;

//spring dependencies
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterAttributesRepository extends JpaRepository<CharacterAttributes, Long> {
}
