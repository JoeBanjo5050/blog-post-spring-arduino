package com.springarduino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration

public class SpringArduinoApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringArduinoApplication.class, args);
	}
}

