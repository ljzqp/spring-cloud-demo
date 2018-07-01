package io.demo.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import io.demo.zuul.service.HelloService;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/1 17:33
 */
@RestController
@RequestMapping("/aa")
public class FeignControlelr {


    @Resource
    HelloService helloService;

    @RequestMapping("feignClient")
    public String feignClient(@RequestParam(name = "name") String name){
        return helloService.hello(name);
    }
}
