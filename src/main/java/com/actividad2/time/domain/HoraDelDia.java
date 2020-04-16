package com.actividad2.time.domain;

import lombok.Value;

@Value(staticConstructor = "from")
public class HoraDelDia {
    Hora hora;
    Minuto minuto;
    Segundo segundo;
    Long cantidad_media_noche;
}
