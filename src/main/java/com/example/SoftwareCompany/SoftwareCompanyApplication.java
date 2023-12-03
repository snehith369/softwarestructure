package com.example.SoftwareCompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.SoftwareCompany.Repository")
@EntityScan("com.example.SoftwareCompany.Model")
public class SoftwareCompanyApplication {


	public static void main(String[] args) {
		SpringApplication.run(SoftwareCompanyApplication.class, args);
	}

}
