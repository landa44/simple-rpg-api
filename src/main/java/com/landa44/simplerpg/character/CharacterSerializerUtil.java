package com.landa44.simplerpg.character;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/**
 * Util class to serialize a character contained in another entity.
 */
public final class CharacterSerializerUtil {

    private CharacterSerializerUtil() {}

    /**
     * Add Character name and attributes to the json of the caller class.
     *
     * @param value Character instance contained in the wrapper object
     * @param gen Json generator of the wrapper class
     * @throws IOException throwable method
     */
    public static void serializeCharacter(Character value, JsonGenerator gen) throws IOException {
        gen.writeStringField("name", value.getName());

        gen.writeFieldName("attributes");
        gen.writeStartArray();
        for (var attribute : value.getAttributes()) {
            gen.writeObject(attribute);
        }
        gen.writeEndArray();
    }
}
