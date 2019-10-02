package cn.hust;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 说明这是一个springboot应用的主启动程序类
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    //启动SpringBoot应用
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class);
    }

}
