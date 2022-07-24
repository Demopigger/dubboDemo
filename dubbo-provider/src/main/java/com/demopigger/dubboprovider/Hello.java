package com.demopigger.dubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.demopigger.dubboapi.HelloService;

@Service
public class Hello implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello world!"+name;
    }
}
