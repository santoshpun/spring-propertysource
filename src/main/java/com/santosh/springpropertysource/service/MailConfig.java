package com.santosh.springpropertysource.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@ToString
@Configuration
@PropertySource(value = "classpath:email.properties")
@ConfigurationProperties(prefix = "mail")
public class MailConfig {
    private String hostname;
    private int port;
    private String from;
}
