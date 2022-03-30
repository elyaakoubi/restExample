package com.tpecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TpecommerceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TpecommerceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
