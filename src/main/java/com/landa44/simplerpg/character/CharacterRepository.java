package com.landa44.simplerpg.character;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * A repo to manage access to the Characters table in the db.
 */
@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}