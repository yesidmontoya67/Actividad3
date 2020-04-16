package com.actividad2.time.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class DayTime {
    Hora hora;
    Minuto minuto;
    Segundo segundo;
}
