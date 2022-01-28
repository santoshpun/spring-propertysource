package com.santosh.springpropertysource.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
@PropertySource(value = "classpath:config.properties", ignoreResourceNotFound = true)
public class AppConfig2 {
    @Autowired
    private Environment env;

    @PostConstruct
    public void bootstrap() {
        printApplicationConfigProperties();
    }

    public void printApplicationConfigProperties() {
        String appName = env.getProperty("app.name");
        String appVersion = env.getProperty("app.version");
        String databaseUrl = env.getProperty("database.url");
        String databaseUsername = env.getProperty("database.username");
        String databasePassword = env.getProperty("database.password");

        log.info("========== Environment - Reading config.properties file =========");
        log.info("App Name : " + appName);
        log.info("App Version : " + appVersion);
        log.info("Database URL : " + databaseUrl);
        log.info("Database username : " + databaseUsername);
        log.info("Database password : " + databasePassword);
    }
}
