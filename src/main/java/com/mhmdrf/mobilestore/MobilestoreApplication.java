package com.mhmdrf.mobilestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MobilestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilestoreApplication.class, args);
	}

}
