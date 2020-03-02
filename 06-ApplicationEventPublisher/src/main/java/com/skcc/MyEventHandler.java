package com.skcc;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//빈으로 등록해야 스프링 컨테이너가 어따가 이 이벤트를 던져줘야 할지 안다..@
@Component
public class MyEventHandler {

	@EventListener
	public void test(MyEvent event) {
		System.out.println("이벤트받아쪄용 " + event.getData());
	}
	
	
	@EventListener
	public void test(ContextRefreshedEvent event) {
		System.out.println("이벤트생성시~~~~~~~~~~~~~~~~~");
	}
	
	
	@EventListener
	public void test(ContextClosedEvent event) {
		System.out.println("이벤트 종료시~~~~~~~~~~~~~~~~");
	}
}
