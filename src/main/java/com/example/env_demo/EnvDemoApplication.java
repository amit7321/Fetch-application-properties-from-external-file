package com.example.env_demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Configuration
@SpringBootApplication
public class EnvDemoApplication  {

    private static final Logger log = LoggerFactory.getLogger(EnvDemoApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(EnvDemoApplication.class, args) ;
    }


}


