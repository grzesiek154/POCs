package com.poc.gallery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;


@EnableEurekaClient
@SpringBootApplication
public class GalleryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GalleryServerApplication.class, args);
    }




    @Configuration
    class RestTemplateConfig {

        @Bean
        @LoadBalanced// Load balance between service instances running at different ports
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }
    }
}
