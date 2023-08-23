package com.landa44.simplerpg.attribute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("checkstyle:MissingJavadocType")
@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {
}