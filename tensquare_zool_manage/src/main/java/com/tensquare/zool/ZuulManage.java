package com.tensquare.zool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulManage {
    public static void main(String[] args) {
        SpringApplication.run(ZuulManage.class, args);
    }
}
