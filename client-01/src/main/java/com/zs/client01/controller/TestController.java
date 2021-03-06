package com.zs.client01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    // ${env.name} + world
    //相当于引用了yml文件中的  env.name配置
    //如果没有获取到env.name 的值，就会默认读取 :后面的值，相当于一个默认值了
    @Value("${env.name:config server not found}")
    private String bar;

    @Value("${env.name}")
    private String foo;

    @RequestMapping("/app")
    String hello() {
        return "Hello " + bar + "!";
    }
}

