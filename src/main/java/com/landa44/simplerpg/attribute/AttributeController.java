package com.landa44.simplerpg.attribute;

//java dependencies
import java.util.Arrays;
import java.util.List;

//spring dependencies
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rpg/v1/attributes")
public class AttributeController {

    @GetMapping
    public List<Attribute> getAttributes() {
        return Arrays.asList(Attribute.values());
    }
}
