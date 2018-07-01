package io.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/1 17:09
 */
//无论是服务提供方还是服务调用方，相对于注册中心都是客户端
@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaServiceProviderApplication.class,args);
    }
}
