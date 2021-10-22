package br.com.sada.sistema.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SistemaCatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaCatalogoApplication.class, args);
	}

}
