package cn.hust.controller;


import cn.hust.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
   /* @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.notexit");
        map.put("message",e.getMessage());
        return map;

    }*/


    @ExceptionHandler(MyException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexit");
        map.put("message",e.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";

    }
}
