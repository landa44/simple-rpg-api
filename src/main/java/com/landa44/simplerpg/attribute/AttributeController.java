package com.landa44.simplerpg.attribute;

//java dependencies
import java.util.List;

//spring dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rpg/v1/attributes")
public class AttributeController {
    private final AttributeService attributeService;

    @Autowired
    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @GetMapping
    public List<Attribute> getAttributes() {
        return attributeService.getAttributes();
    }
}
