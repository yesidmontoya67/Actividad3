package com.actividad2.time.domain;

import com.actividad2.common.Preconditions;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Value(staticConstructor = "of")
public class UnidadDeTiempo {
    String value;

    private UnidadDeTiempo(String value){
        List<String> unidades= Arrays.asList("Milisegundos", "Segundos", "Minutos", "Horas");
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(unidades.contains(value));
        Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        this.value=value;
    }

    public Long calcularMedianoche(LocalTime time){
        Long horas= Long.valueOf(time.getHour());
        Long minutos= Long.valueOf(time.getMinute());
        Long segundos= Long.valueOf(time.getSecond());
        Long resultado=0L;
       switch (this.value){
           case "Horas":
               resultado= horas ;
             return resultado;
           case "Minutos":
               resultado = (horas*60) + minutos;
               return resultado;
           case "Segundos":
               resultado= ((horas*60)*60) + (minutos*60) + segundos;
               return resultado;
           case "Milisegundos":
               resultado= (((horas*60)*60)*1000) + ((minutos*60)*1000) + (segundos*1000);
               return resultado;
           default:
               return resultado;
       }
    }
}
