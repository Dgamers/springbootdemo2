package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.demo.dao")
@EntityScan(basePackages = "com.demo.pojo")
@ComponentScan(basePackages = "com")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
