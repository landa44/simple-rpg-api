package com.landa44.simplerpg.enemy;

//java dependencies
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.landa44.simplerpg.character.CharacterSerializerUtil;

public class EnemySerializer extends JsonSerializer<Enemy> {
    @Override
    public void serialize(Enemy value, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
        gen.writeStartObject();

        gen.writeNumberField("id", value.getId());
        CharacterSerializerUtil.serializeCharacter(value.getCharacter(), gen);

        gen.writeEndObject();
    }
}
