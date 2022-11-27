package com.daemon.sistema.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RpgSistemaDaemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgSistemaDaemonApplication.class, args);
	}


}
