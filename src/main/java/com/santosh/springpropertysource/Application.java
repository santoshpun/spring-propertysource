package com.santosh.springpropertysource;

import com.santosh.springpropertysource.service.MailConfig;
import com.santosh.springpropertysource.service.MySQLConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private MailConfig mailConfig;
    @Autowired
    private MySQLConfig mysqlConfig;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Mail configuration : " + mailConfig);
        log.info("MySQL config : driver class name = " + mysqlConfig.getDriverClassName());
    }
}
