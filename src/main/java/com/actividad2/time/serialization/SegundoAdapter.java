package com.actividad2.time.serialization;

import com.actividad2.time.domain.Segundo;
import com.google.gson.*;

import java.lang.reflect.Type;

public class SegundoAdapter implements JsonDeserializer<Segundo>, JsonSerializer<Segundo> {

    @Override
    public Segundo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int value=jsonElement.getAsInt();
        return Segundo.of(value);
    }

    @Override
    public JsonElement serialize(Segundo segundo, Type type, JsonSerializationContext jsonSerializationContext) {
        int value = segundo.getValue();
        return new JsonPrimitive(value);
    }
}
