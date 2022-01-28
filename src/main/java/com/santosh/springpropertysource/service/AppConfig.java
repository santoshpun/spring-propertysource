package com.santosh.springpropertysource.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:config.properties")
        //can add multiple property source
})
public class AppConfig {

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
        log.info("========== Property Source - Reading config.properties file =========");
        log.info("App Name : " + appName);
        log.info("App Version : " + appVersion);
        log.info("Database URL : " + databaseUrl);
        log.info("Database username : " + databaseUsername);
        log.info("Database password : " + databasePassword);
    }
}
