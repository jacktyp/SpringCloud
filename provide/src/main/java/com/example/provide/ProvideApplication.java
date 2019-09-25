package com.example.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 本服务启动后会自动注册进eureka服务中
 * 服务发现
 * 对hystrixR熔断机制的支持
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class, args);
	}

}
