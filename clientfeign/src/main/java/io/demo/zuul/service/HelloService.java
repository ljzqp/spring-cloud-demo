package io.demo.zuul.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/1 17:35
 */
/*
    *@FeignClient(value = "EUREKA-SERVICE-PROVIDER")
    *这里需要大写
 */
@FeignClient(value = "SERVICE-PROVIDER")
public interface HelloService {

    @RequestMapping(value = "/bb/service/helloStr",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/bb/service/hello",method = RequestMethod.GET)
    String hhh();
}
