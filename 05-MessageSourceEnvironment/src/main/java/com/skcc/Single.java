package com.skcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Single {
	
	@Autowired
	Proto proto;
	
	public Proto getProto() {
		return proto;
	}
	
	

}
