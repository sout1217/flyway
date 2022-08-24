package com.example.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile(value = {"h2", "local", "dev", "mysql"})
@SpringBootApplication(scanBasePackages = "com.example.flyway.dev")
@EntityScan(basePackages = "com.example.flyway.dev")
@EnableJpaRepositories(basePackages = "com.example.flyway.dev")
public class DevFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevFlywayApplication.class, args);
	}

}
