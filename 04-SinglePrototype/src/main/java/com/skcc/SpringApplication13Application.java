package com.skcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
//@Repository
//@Service
//@Controller
//@Configuration
//위에것들을 컴포넌트스캔을 해서 빈으로 등록한다.
//빈이 많으면 초기 구동시 빈을 생성해야하기때문에 오래 걸릴 수 있다.
//ComponentScan개념! 빈의 라이프싸이클~~ 싱글톤 프로토타입~
@SpringBootApplication
public class SpringApplication13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplication13Application.class, args);
	}

}
