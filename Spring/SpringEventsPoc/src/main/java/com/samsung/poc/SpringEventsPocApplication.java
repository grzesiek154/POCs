package com.samsung.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
public class SpringEventsPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventsPocApplication.class, args);
    }

}
