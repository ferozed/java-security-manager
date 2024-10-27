package io.github.ferozed.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

import io.github.ferozed.sm.HelloWorld;

@Configuration
@ComponentScan("io.github.ferozed.sm")
public class SecurityManagerConfiguration {


    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}