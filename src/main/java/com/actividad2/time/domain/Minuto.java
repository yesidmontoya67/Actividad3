package com.actividad2.time.domain;

import com.actividad2.common.Preconditions;
import com.actividad2.time.serialization.IntSerializable;
import lombok.Value;

@Value(staticConstructor = "of")
public class Minuto implements IntSerializable {
    int value;

    private Minuto(int value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value>=0 && value<=59);
        //Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        this.value=value;
    }

    @Override
    public int valueOf() {
        return value;
    }
}
