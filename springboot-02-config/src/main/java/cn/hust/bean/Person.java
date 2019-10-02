package cn.hust.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties(prefix = "person") 将yml配置文件中的相关配置与该类属性对应起来
 * 但也要保证该类是一个容器中的组件，才能使用@ConfigurationProperties
 * @Validated 进行jsr303检验
 * @ConfigurationProperties(prefix = "person") 默认从全局配置中取
 * @PropertySource(value = {"classpath:person.properties"}) 从局部某个文件取
 * 一定还要加上@ConfigurationProperties(prefix = "person")注解
 */

@ConfigurationProperties(prefix = "person1")
@PropertySource(value = {"classpath:person.properties"})
@Component
@Validated
public class Person {

    //@value注解三种取值方式 1、@value("") 2、@value("#{Spel}") 3、@value("${}")用来取出配置文件的数据
   // @Value("小妖精")
    //@Email
    private String userName;
   // @Value("#{11*12}")
    private Integer age;
  //  @Value("${person.boss}")
    private Boolean boss;
    private Date date;

   // @Value("${person.maps}") 不支持复杂类型封装
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", date=" + date +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
