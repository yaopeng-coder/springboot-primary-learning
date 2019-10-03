package cn.hust.controller;

import cn.hust.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

 /*   @RequestMapping("/")
    public String index(){
        return "index";
    }*/


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String id){
        if(id.equals("aaa")){
            throw new MyException();
        }

        return "hhl";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>您好<h1>");
        map.put("users", Arrays.asList("zhangsan","lisi"));
        System.out.println("tsee");
        return "success";
    }


}
