package cn.hust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class Springboot04WebRestfulcrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(Springboot04WebRestfulcrudApplication.class, args);
	}

	@Bean
	public ViewResolver resolver(){
		return  new MyViewResolver();
	}

	class MyViewResolver implements  ViewResolver{
		@Nullable
		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}

}
