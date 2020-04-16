package com.actividad2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
@EnableConfigurationProperties
public class Actividad2Application {

	public static void main(String[] args) {
		SpringApplication.run(Actividad2Application.class, args);
	}

}
