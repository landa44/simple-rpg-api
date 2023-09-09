package com.landa44.simplerpg.character.attribute;

//java dependencies
import java.io.IOException;

//external dependencies
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CharacterAttributesSerializer extends JsonSerializer<CharacterAttributes> {
    @Override
    public void serialize(CharacterAttributes value, JsonGenerator gen,
                          SerializerProvider serializers) throws IOException {
        gen.writeStartObject();

        gen.writeStringField("attribute", value.getAttribute().getName());
        gen.writeNumberField("value", value.getValue());

        gen.writeEndObject();
    }
}
