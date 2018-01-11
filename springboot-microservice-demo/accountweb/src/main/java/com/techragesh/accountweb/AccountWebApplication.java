package com.techragesh.accountweb;

import com.techragesh.accountweb.repository.AccountRepository;
import com.techragesh.accountweb.repository.RemoteAccountService;
import com.techragesh.accountweb.repository.RemoteStockService;
import com.techragesh.accountweb.repository.StockRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class AccountWebApplication {

	public static final String ACCOUNT_SERVICE_URL ="http://accountservice";

	public static final String STOCK_SERVICE_URL = "http://stockservice";

	public static void main(String[] args) {
		SpringApplication.run(AccountWebApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	public AccountRepository accountRepository(){
		return new RemoteAccountService(ACCOUNT_SERVICE_URL);
	}

	@Bean
	public StockRepository stockRepository(){
		return new RemoteStockService(STOCK_SERVICE_URL);
	}
}
