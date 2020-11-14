package com.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.provider.mapper")
public class ProviderApplcation1 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplcation1.class,args);
    }
}
