package com.skcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Repository를 빈으로 등록 안했을 때@@@@@
//그니까 빈에 없는거지.. 
@SpringBootApplication
public class SpringApplication12Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplication12Application.class, args);
	}

}
