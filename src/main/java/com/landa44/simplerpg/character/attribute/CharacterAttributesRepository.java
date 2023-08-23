package com.landa44.simplerpg.character.attribute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("checkstyle:MissingJavadocType")
@Repository
public interface CharacterAttributesRepository extends JpaRepository<CharacterAttributes, Long> {
}
