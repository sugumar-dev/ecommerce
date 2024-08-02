package com.houseoffourleaf.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.logging.Logger;

@SpringBootApplication
public class EcommerceApplication {

	private static final Logger log = Logger.getLogger(EcommerceApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		log.info("Ecommerce Application Started");
	}

}
