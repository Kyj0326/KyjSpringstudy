package com.skccc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AppRunner implements ApplicationRunner{
	
	
	@Autowired
	Validator validator;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Event event = new Event();
		event.setEmail("aaa22");
		event.setLimit(-1);
		Errors errors = new BeanPropertyBindingResult(event, "event");
		
		validator.validate(event, errors);
		System.out.println(errors.hasErrors()+"has에러요@@##");
		
		errors.getAllErrors().forEach(e -> {
			System.out.println("========== error code =========");
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
			
		});
		
	}

}
