package com.backend.rentik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RentikApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentikApplication.class, args);
	}

}
