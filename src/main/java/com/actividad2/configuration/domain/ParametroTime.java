package com.actividad2.configuration.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "time")
@RequiredArgsConstructor
@Data
public class ParametroTime {
    private String unidad;

}
