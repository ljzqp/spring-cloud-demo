package io.demo.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luowenbin
 * @email luowenbin@hey900.com
 * @date 2018/7/1 17:41
 */
@RestController
@RequestMapping("/bb")
public class ServiceProviderController {

    @RequestMapping(name = "/service/helloStr",method = RequestMethod.GET)
    public String getHelloString(@RequestParam(name = "name") String name){
        return "大家好！这里是服务端的消息：->"+name;
    }
}
