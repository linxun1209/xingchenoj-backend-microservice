package com.xingchen.xingchenojUserService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xingchen.xingchenojUserService.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xingchen")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xingchen.xingchenojUserService.service"})
public class XingchenojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XingchenojBackendUserServiceApplication.class, args);
    }

}
