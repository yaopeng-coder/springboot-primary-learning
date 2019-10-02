package cn.hust;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {


	org.slf4j.Logger logger =  LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {
		logger.trace("这是一个trace日志");
		logger.debug("这是一个debug日志");
		logger.info("这是一个info日志");
		logger.warn("这是一个warnz日志");
		logger.error("这是一个error日志");

	}

}
