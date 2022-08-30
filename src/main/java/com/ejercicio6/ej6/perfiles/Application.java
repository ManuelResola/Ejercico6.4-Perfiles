package com.ejercicio6.ej6.perfiles;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("miconfiguracion.properties")
@SpringBootApplication
@ToString
public class Application implements CommandLineRunner {

	@Autowired
	Propiedades propiedades;

	@Autowired
	Propiedades.MiConfiguracion miConfiguracion;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
//		System.out.println("password = " + propiedades.getPassword());
//		System.out.println("url = " + propiedades.getUrl());

		System.out.println("valor1 = " + miConfiguracion.getValor1());
		System.out.println("valor2 = " + miConfiguracion.getValor2());
	}


}