package cn.hust;

import cn.hust.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

	@Autowired
	private Person person;



	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testService(){
	 Boolean b = applicationContext.containsBean("helloService");
	 System.out.println(b);

	}

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
