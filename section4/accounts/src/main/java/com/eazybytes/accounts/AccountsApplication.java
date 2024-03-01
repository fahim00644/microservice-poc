package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info=@Info(
			title="Accounts Microservice REST API Documentation",
			description = "TestBank Accounts microservice Rest API doc",
			version = "v1",
			contact = @Contact(
					name = "Fahim",
					email = "testapplication@testmail.com"
			),
			license = @License(
					name = "Apache 2.0"
			)
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
