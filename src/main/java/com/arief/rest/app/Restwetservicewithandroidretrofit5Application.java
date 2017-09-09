package com.arief.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.arief.rest.domain")
@EnableJpaRepositories("com.arief.rest.services")
@ComponentScan({"com.arief.rest.restcontrollers"})
public class Restwetservicewithandroidretrofit5Application {

	public static void main(String[] args) {
		SpringApplication.run(Restwetservicewithandroidretrofit5Application.class, args);
	}
}
