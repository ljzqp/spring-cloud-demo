package io.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/2 23:16
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CloudZuulApplication {
    public static void main(String[] args){
        SpringApplication.run(CloudZuulApplication.class,args);
    }
}
