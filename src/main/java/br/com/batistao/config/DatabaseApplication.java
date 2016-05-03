package br.com.batistao.config;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by ceb on 30/04/16.
 */
@Configuration
@ComponentScan(basePackages = "br.com.batistao")
@EntityScan(basePackages = "br.com.batistao.model")
@EnableJpaRepositories(basePackages = "br.com.batistao.repository")
@EnableAutoConfiguration
@SpringBootApplication
public class DatabaseApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DatabaseApplication.class, args);
    }
}
