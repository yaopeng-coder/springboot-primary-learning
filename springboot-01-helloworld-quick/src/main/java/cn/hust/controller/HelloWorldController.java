package cn.hust.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("helloworld")
    public String hello(){
        return "helloworld-quick";
    }
}
