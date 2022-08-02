package com.cloudeducationbrazil.dsvenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Liberar a integração entre o front e back, através do Cors.
// Classe SecurityConfig.java no package config
@SpringBootApplication
public class DsvendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsvendaApplication.class, args);
	}

}
