package com.landa44.simplerpg.character;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

public final class CharacterSerializerUtil {
    private CharacterSerializerUtil() {};
    public static void serializeCharacter(Character value, JsonGenerator gen) throws IOException {
        gen.writeStringField("name", value.getName());

        gen.writeFieldName("attributes");
        gen.writeStartArray();
        for(var attribute: value.getAttributes()){
            gen.writeObject(attribute);
        }
        gen.writeEndArray();
    }
}
