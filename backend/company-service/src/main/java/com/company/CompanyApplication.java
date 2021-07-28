package com.company;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableEurekaClient
public class CompanyApplication {
	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}



@Bean
public Docket swaggerConfig() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.company"))
			
			.build()
			.apiInfo(apiDetails());
}
private ApiInfo apiDetails() {
	return new ApiInfo(
			"Company Microservice API",
			"API Documentation for Company Microservice",
			"1.0",
			"Free to use",
			new springfox.documentation.service.Contact("Neha Jha", "https://github.com/2NJ7", "2799nehajha@gmail.com"),
			"API License",
			"https://github.com/2NJ7/socgen-stockmarket-project",
			Collections.emptyList()
			);
}}