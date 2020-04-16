package com.actividad2.time.controller;

import com.actividad2.configuration.domain.ParametroTime;
import com.actividad2.time.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api/v1/date")
public class TimeController {
    @Autowired
    ParametroTime parametroTime;

    @GetMapping("/horaactual")
    public HoraDelDia horaActual(){
        LocalTime time= LocalTime.now();
        Hora hora= Hora.of(time.getHour());
        Minuto minuto= Minuto.of(time.getMinute());
        Segundo segundo= Segundo.of(time.getSecond());
        UnidadDeTiempo unidadDeTiempo= UnidadDeTiempo.of(parametroTime.getUnidad());
        return HoraDelDia.from(hora,minuto,segundo, unidadDeTiempo.calcularMedianoche(time));
    }
}
