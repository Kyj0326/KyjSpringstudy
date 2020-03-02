package com.skcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

//Environment@@@@ 환경에따라(개발,테스트,알파,운영마다 다른 빈을 쓰고싶다@@) 
//@Profile의 어노테이션을 붙여서 활용하면된다.
@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringApplication14Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplication14Application.class, args);
	}

	
 //messagesource!!!!!!!!!!!사용하는거~~
//	@Bean
//	public MessageSource messageSource() {
//	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//	messageSource.setBasename("classpath:/messages");
//	messageSource.setDefaultEncoding("UTF-8");
//	messageSource.setCacheSeconds(3);
//	return messageSource;
//	}
	
}
