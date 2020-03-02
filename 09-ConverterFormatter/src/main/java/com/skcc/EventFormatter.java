package com.skcc;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class EventFormatter implements Formatter<Event>{
	
	@Autowired
	MessageSource msgSource;

	@Override
	public String print(Event object, Locale locale) {
		// TODO Auto-generated method stub
		
		msgSource.getMessage("title", null, locale);
		
		return object.getId().toString();
	}

	@Override
	public Event parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return new Event(Integer.parseInt(text));
	}
	
	

}
