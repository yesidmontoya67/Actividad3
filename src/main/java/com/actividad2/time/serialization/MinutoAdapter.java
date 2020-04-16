package com.actividad2.time.serialization;

import com.actividad2.time.domain.Minuto;
import com.google.gson.*;

import java.lang.reflect.Type;

public class MinutoAdapter implements JsonDeserializer<Minuto>, JsonSerializer<Minuto> {

    @Override
    public Minuto deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int value=jsonElement.getAsInt();
        return Minuto.of(value);
    }

    @Override
    public JsonElement serialize(Minuto minuto, Type type, JsonSerializationContext jsonSerializationContext) {
        int value = minuto.getValue();
        return new JsonPrimitive(value);
    }
}
