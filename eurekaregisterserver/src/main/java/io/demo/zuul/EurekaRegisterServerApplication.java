package io.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/1 16:39
 */
//@EnableEurekaServer:标注为eureka启动中心
@SpringBootApplication
@EnableEurekaServer
//@EnableAutoConfiguration
public class EurekaRegisterServerApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaRegisterServerApplication.class,args);
    }
}
