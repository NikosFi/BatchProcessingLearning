package com.udemycourse.springbatchh2;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.udemycourse.springbatchh2.config")
public class SpringbatchH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatchH2Application.class, args);
    }

}
