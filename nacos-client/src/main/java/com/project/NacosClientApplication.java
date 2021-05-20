package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启nacos 的注解
@EnableDiscoveryClient
@EnableFeignClients
public class NacosClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosClientApplication.class, args);
    }



}
