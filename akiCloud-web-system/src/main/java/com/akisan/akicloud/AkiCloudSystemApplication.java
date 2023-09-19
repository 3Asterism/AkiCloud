package com.akisan.akicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AkiCloudSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkiCloudSystemApplication.class, args);
    }
}
