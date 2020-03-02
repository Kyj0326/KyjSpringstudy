package com.skcc;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

	
	@EventListener
	//@Order(Ordered.HIGHEST_PRECEDENCE) //머가 먼저 이벤트를 받는지 모르는데 이거를 옵션을 주면 제일 먼저 받아서 처리가 된다.
	public void test(MyEvent event) {
		System.out.println("다른 리스너에서 이벤트받아쪄용 " + event.getData());
	}
	
	
	
}
