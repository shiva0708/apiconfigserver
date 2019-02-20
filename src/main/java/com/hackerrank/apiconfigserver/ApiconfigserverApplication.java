package com.hackerrank.apiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ApiconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiconfigserverApplication.class, args);
	}

}
