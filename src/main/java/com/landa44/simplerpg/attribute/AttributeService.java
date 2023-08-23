package com.landa44.simplerpg.attribute;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class that provides operations related to Attributes
 */
@Service
public class AttributeService {
    private final AttributeRepository attributeRepository;

    @Autowired
    public AttributeService(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    public List<Attribute> getAttributes() {
        return attributeRepository.findAll();
    }

    public Attribute getLifeAttribute() {
        return attributeRepository.getReferenceById(1L);
    }

    public Attribute getStrengthAttribute() {
        return attributeRepository.getReferenceById(2L);
    }

    public Attribute getManaAttribute() {
        return attributeRepository.getReferenceById(3L);
    }
}
