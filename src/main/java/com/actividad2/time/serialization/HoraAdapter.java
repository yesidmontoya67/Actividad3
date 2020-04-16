package com.actividad2.time.serialization;

import com.actividad2.time.domain.Hora;
import com.google.gson.*;

import java.lang.reflect.Type;

public class HoraAdapter implements JsonDeserializer<Hora>, JsonSerializer<Hora> {

    @Override
    public Hora deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int value=jsonElement.getAsInt();
        return Hora.of(value);
    }

    @Override
    public JsonElement serialize(Hora hora, Type type, JsonSerializationContext jsonSerializationContext) {
        int value = hora.getValue();
        return new JsonPrimitive(value);
    }
}
