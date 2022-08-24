package com.example.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile("staging")
@SpringBootApplication(scanBasePackages = "com.example.flyway.staging")
@EntityScan(basePackages = "com.example.flyway.staging")
@EnableJpaRepositories(basePackages = "com.example.flyway.staging")
public class StagingFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagingFlywayApplication.class, args);
	}

}
