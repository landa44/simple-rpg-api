package com.landa44.simplerpg.enemy;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.landa44.simplerpg.character.CharacterSerializerUtil;
import com.landa44.simplerpg.hero.Hero;
import java.io.IOException;

public class HeroSerializer extends JsonSerializer<Hero> {
    @Override
    public void serialize(Hero value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
        gen.writeStartObject();

        gen.writeNumberField("id", value.getId());
        CharacterSerializerUtil.serializeCharacter(value.getCharacter(), gen);

        gen.writeEndObject();
    }
}
