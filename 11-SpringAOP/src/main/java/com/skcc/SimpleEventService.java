package com.skcc;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

	@Override
	public void createEvent() {
		// TODO Auto-generated method stub
		//long begin = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("created an event");
		//System.out.println(System.currentTimeMillis() - begin);
		
	}

	@Override
	public void publishEvent() {
		// TODO Auto-generated method stub
		//long begin = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("published an event");
		
		//System.out.println(System.currentTimeMillis() - begin);
	}
	
	public void deleteEvent() {
		System.out.println("deleted an event");
	}

}
