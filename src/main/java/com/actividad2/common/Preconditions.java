package com.actividad2.common;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Preconditions {
    public static void checkNotNull(Object reference){
        if(Objects.isNull(reference)){
            throw new NullPointerException();
        }
    }

    public static void checkArgument(boolean argument){
        if(!argument){
            throw new IllegalArgumentException();
        }
    }

}
