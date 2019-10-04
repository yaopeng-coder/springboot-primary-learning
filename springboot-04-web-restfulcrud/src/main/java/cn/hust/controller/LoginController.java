package cn.hust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session){
            if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
                session.setAttribute("login","username");
                //防止重复提交表单
                return "redirect:/main.html";
            }else{
                map.put("msg","登陆错误");
                return "index";
            }


    }
}
