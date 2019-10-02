package cn.hust.config;

import cn.hust.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService(){
        return  new HelloService();
    }


}
