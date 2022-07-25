package com.demopigger.dubbocustomer.com.demopigger.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demopigger.dubboapi.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {

    @Reference //引用服务
    private HelloService helloService;

    @GetMapping("/sayMyHello")
    private String sayMyHello(@RequestParam String name){

        System.out.println("调用sayHello成功了..." + " name:" + name);

        return helloService.sayHello(name);
    }
}
