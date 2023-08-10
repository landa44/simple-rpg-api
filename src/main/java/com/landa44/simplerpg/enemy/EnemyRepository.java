package com.landa44.simplerpg.enemy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repo to manage access to the Enemies table in the db.
 */
@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Long> {
}