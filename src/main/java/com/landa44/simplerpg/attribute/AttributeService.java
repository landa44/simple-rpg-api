package com.landa44.simplerpg.attribute;

//java dependencies
import java.util.List;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
