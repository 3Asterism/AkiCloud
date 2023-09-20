package com.akisan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AkiCloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkiCloudGatewayApplication.class, args);
    }
}