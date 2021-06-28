package com.softpera.pluralsightm1configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsightM1ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluralsightM1ConfigServerApplication.class, args);
    }

}
