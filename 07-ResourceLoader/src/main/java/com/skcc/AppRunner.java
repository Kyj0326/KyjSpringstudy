package com.skcc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	
	@Autowired
	ResourceLoader resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Resource resource = resourceLoader.getResource("classpath:text.txt");
		System.out.println(resource.exists()+"exists()");
		System.out.println(resource.getDescription()+"getDescription()");
		Path path = Paths.get(resource.getURI());
	    List<String> content = Files.readAllLines(path);
	    content.forEach(System.out::println);
		
	}
	

}
