package com.santosh.springpropertysource.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class PropertyRead {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @Value("${database.url}")
    private String databaseUrl;
    @Value("${database.username}")
    private String databaseUsername;
    @Value("${database.password}")
    private String databasePassword;

    @PostConstruct
    public void bootstrap() {
        printApplicationConfigProperties();
    }

    public void printApplicationConfigProperties() {
        log.info("========== Reading application.properties file =========");
        log.info("App Name : " + appName);
        log.info("App Version : " + appVersion);
        log.info("Database URL : " + databaseUrl);
        log.info("Database username : " + databaseUsername);
        log.info("Database password : " + databasePassword);
    }
}
