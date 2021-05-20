package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//开启nacos 的注解
@EnableDiscoveryClient
public class NacosUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserApplication.class, args);
    }

}
