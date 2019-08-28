package com.tedu.sp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sp03ItemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp03ItemserviceApplication.class, args);
	}

}
