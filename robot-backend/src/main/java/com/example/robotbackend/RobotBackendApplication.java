package com.example.robotbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.robotbackend.*")
public class RobotBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobotBackendApplication.class, args);
	}

}
