package com.bl.autherization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class AutherizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutherizationApplication.class, args);
	}

/*	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RestController
	class TestController{


		private RestTemplate restTemplate = restTemplate();

		@GetMapping("/test/{str}")
		public String requestTest(@PathVariable String str){
			return restTemplate.getForObject("http://server-2/resource/get/"+str,String.class);
		}

	}*/

}
