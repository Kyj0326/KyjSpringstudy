package com.skcc;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

@Component
public class AppRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Event event = new Event();
		EventValidator eventValidator = new  EventValidator();
		Errors errors = new BeanPropertyBindingResult(event, "event");
		
		eventValidator.validate(event, errors);
		System.out.println(errors.hasErrors());
		
		errors.getAllErrors().forEach(e -> {
			System.out.println("========== error code =========");
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
			
		});
		
	}

}
