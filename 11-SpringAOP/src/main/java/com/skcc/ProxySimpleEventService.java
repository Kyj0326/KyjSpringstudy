package com.skcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//이거를.. 하나하나 다 만들어서할꺼냐!?
//중복코드가 생기는단점,, proxy를하나하나 만들어야 하는단점!

//스프링 IOC컨테이너를 이용하여 해결한다~
//그게 스프링AOP다!
@Primary
@Service
public class ProxySimpleEventService implements EventService {

	@Autowired
	SimpleEventService simpleEventService;
	
	@Override
	public void createEvent() {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		simpleEventService.createEvent();
		System.out.println(System.currentTimeMillis()-begin);
	}

	@Override
	public void publishEvent() {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		simpleEventService.publishEvent();
		System.out.println(System.currentTimeMillis()-begin);
	}

	@Override
	public void deleteEvent() {
		// TODO Auto-generated method stub
		simpleEventService.deleteEvent();
	}
	

}
