package com.skccc;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

	@PerfLogging
	@Override
	public void createEvent() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("created an event");

		
	}

	@PerfLogging
	@Override
	public void publishEvent() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("published an event");
		
	}
	
	public void deleteEvent() {
		System.out.println("deleted an event");
	}

}
