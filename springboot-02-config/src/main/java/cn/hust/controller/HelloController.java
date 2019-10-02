package cn.hust.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @Value("${person1.user-name}")
    String name;

    @RequestMapping("/helloworld")
    public String hello(){
            System.out.println("ceshi");
        return "helloworld"+name;
    }
}
