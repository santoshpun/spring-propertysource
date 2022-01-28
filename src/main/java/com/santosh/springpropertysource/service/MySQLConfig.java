package com.santosh.springpropertysource.service;

import com.santosh.springpropertysource.util.YamlPropertyLoaderFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "jdbc.mysql")
@PropertySource(
        value = "classpath:database/mysql-config.yml",
        factory = YamlPropertyLoaderFactory.class)
public class MySQLConfig {

    String driverClassName;
    String url;
    String username;
    String password;

}
