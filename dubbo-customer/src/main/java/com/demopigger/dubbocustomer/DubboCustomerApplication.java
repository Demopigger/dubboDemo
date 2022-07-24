package com.demopigger.dubbocustomer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demopigger.dubboapi.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DubboCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }
    @RestController
    public class Mycontroller {
        @Reference //引用服务
        private HelloService helloService;

        @GetMapping("/sayHello")
        private String sayHello(@RequestParam String name){

            System.out.println("调用sayHello成功了..." + " name:" + name);

            return helloService.sayHello(name);
        }
        @RequestMapping("/say")
        private String say(@RequestParam String name){

            System.out.println("调用sayHello成功了..." + " name:" + name);

            return helloService.sayHello(name);
        }
    }
}
