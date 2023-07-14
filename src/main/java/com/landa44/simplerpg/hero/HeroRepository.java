package com.landa44.simplerpg.hero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repo to manage access to the Heroes table in the db.
 */
@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}