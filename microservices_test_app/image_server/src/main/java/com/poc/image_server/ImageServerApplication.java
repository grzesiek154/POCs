package com.poc.image_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ImageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageServerApplication.class, args);
    }

}
