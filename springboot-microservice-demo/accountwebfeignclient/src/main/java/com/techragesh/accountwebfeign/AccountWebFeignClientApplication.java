package com.techragesh.accountwebfeign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AccountWebFeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountWebFeignClientApplication.class, args);
	}
}
