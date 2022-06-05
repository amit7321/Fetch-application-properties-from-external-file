package com.example.env_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Cli implements CommandLineRunner {

    @Value("${spring.url}")
    private String url;

    @Value("${spring.password}")
    private String password;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(password);
        System.out.println(url);
    }
}
