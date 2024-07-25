package com.houseoffourleaf.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class EcommerceApplication {

	private static final Logger log = Logger.getLogger(EcommerceApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		log.info("Ecommerce Application Started");
	}

}
