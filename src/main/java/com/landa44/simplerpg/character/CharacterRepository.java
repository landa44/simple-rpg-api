package com.landa44.simplerpg.character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repo to manage access to the Characters table in the db.
 */
@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}