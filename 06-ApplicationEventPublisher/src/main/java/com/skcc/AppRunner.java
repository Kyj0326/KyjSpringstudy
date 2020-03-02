package com.skcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	//ApplicationContext로 해도되는데, (상속받고있으니까!) 코드는 그렇게 짜는게 아니다~
	@Autowired
	ApplicationEventPublisher publishEvent;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		publishEvent.publishEvent(new MyEvent(this,100));
		
	}
	
	

}
