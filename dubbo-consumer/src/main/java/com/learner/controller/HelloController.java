package com.learner.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.learner.interf.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Reference
  private HelloService helloService;

  @GetMapping("/hello")
  public String hello(@RequestParam String name) {
    String hello = helloService.sayHello(name);
    return "world";
  }
}
