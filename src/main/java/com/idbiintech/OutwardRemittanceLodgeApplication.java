package com.idbiintech;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OutwardRemittanceLodgeApplication {
	public static Logger log = LoggerFactory.getLogger(OutwardRemittanceLodgeApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(OutwardRemittanceLodgeApplication.class, args);
		log.info("Finacle Bill Of Entry  API is started now " + new Date());
	}

}
