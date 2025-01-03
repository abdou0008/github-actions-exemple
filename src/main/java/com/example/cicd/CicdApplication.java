package com.example.cicd;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAdminServer
public class CicdApplication {

	Logger logger = LoggerFactory.getLogger(CicdApplication.class);
	@GetMapping("/welcome")
	public String welcome(){

		logger.info("starting my greeting methode....");
		return "Welcome to Abdou";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
