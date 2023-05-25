package com.signatureverification.client.main;

import java.util.logging.Logger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan({"com.signatureverification.client.main"})
@EntityScan(basePackages ="com.signatureverification.client.main.entity")
@EnableJpaRepositories(basePackages ="com.signatureverification.client.main.repo")
@EnableDiscoveryClient
public class SignatureVerificationServer {

	protected Logger logger = Logger.getLogger(SignatureVerificationServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-client");

		SpringApplication.run(SignatureVerificationServer.class, args);
	}
}
