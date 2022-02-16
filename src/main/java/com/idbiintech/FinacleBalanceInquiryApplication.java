package com.idbiintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FinacleBalanceInquiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinacleBalanceInquiryApplication.class, args);
	}

}
