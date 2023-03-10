package com.portafolios.joni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@SpringBootApplication
public class JoniApplication {
	public static void main(String[] args) {
		SpringApplication.run(JoniApplication.class, args);
	}
       
}
