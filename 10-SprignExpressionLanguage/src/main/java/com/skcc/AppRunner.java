package com.skcc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	
	@Value("#{1 + 1}")
	int value;
	
	@Value("#{'hello' + 'world'}")
	String greeting;
	
	@Value("#{1 eq 1}")
	boolean trueOfFlase;
	
	@Value("Hello")
	String hello;
	
	@Value("${myvalue}") // properties 값참조법
	String myvalue;
	
	@Value("#{${myvalue} eq 100}") 
	Boolean myvalueis100;
	
	@Value("#{sample.data}")
	int sample;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		System.out.println(value);
		System.out.println(greeting);
		System.out.println(trueOfFlase);
		System.out.println(hello);
		System.out.println(myvalue);
		System.out.println(myvalueis100);
		System.out.println(sample);
	}

}
