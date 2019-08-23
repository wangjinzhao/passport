package com.gold.wang.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PassportApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassportApplication.class, args);
	}
}
