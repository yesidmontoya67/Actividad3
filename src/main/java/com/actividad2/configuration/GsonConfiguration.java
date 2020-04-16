package com.actividad2.configuration;

import com.actividad2.time.serialization.HoraAdapter;
import com.actividad2.time.serialization.IntValueAdapter;
import com.actividad2.time.serialization.MinutoAdapter;
import com.actividad2.time.serialization.SegundoAdapter;
import com.actividad2.time.domain.Hora;
import com.actividad2.time.domain.Minuto;
import com.actividad2.time.domain.Segundo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        Function<String,Segundo> segundo = new Function<String, Segundo>() {
            @Override
            public Segundo apply(String s) {
                return Segundo.of(Integer.parseInt(s));
            }
        };

        Function<String,Minuto> minuto = s -> Minuto.of(Integer.parseInt(s));

        Function<String,Hora> hora = s -> Hora.of(Integer.parseInt(s));

        return new GsonBuilder()
                .registerTypeAdapter(Hora.class,new IntValueAdapter<>(hora))
                .registerTypeAdapter(Minuto.class,new IntValueAdapter<>(minuto))
                .registerTypeAdapter(Segundo.class,new IntValueAdapter<>(segundo))
                .create();
    }
}
