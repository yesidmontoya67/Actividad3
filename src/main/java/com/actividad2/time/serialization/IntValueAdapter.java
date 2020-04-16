package com.actividad2.time.serialization;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.function.Function;

public class IntValueAdapter<T extends IntSerializable> implements GsonAdapter<T>{

    private final Function<String,T> factory;

    public IntValueAdapter(Function<String, T> factory) {
        this.factory = factory;
    }

    @Override
    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int value= jsonElement.getAsInt();
        return factory.apply(String.valueOf(value));
    }

    @Override
    public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
       int value= t.valueOf();
        return new JsonPrimitive(value);
    }
}
