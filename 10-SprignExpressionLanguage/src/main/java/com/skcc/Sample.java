package com.skcc;

import org.springframework.stereotype.Component;

@Component
public class Sample {
	
	int data = 100000;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
