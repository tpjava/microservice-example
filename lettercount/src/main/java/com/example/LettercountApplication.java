package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@RestController
@RequestMapping(value = "/lettercount", method = RequestMethod.GET)
public class LettercountApplication {

	public static void main(String[] args) {
		SpringApplication.run(LettercountApplication.class, args);
	}

	@RequestMapping(value = "/{letter}", method = RequestMethod.GET)
	public int getLetterCount(@PathVariable String letter) {
		return letter == null ? 0 : letter.length();

	}
}
