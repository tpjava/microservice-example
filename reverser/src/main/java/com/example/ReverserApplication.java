package com.example;

import org.bouncycastle.util.Arrays;
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
@RequestMapping(value = "/reverse", method = RequestMethod.GET)
public class ReverserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverserApplication.class, args);
	}

	@RequestMapping(value = "/{word}", method = RequestMethod.GET)
	public String reverseString(@PathVariable String word) {
		return new String(Arrays.reverse(word.getBytes()));
	}
}
