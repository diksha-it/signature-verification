package com.signatureverification.client.main;

import java.util.logging.Logger;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan({ "com.signatureverification.client.main" })
@EntityScan(basePackages = "com.signatureverification.client.main.entity")
@EnableJpaRepositories(basePackages = "com.signatureverification.client.main.repo")
@EnableDiscoveryClient
public class SignatureVerificationServer {

	protected Logger logger = Logger.getLogger(SignatureVerificationServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-client");

		SpringApplication.run(SignatureVerificationServer.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
