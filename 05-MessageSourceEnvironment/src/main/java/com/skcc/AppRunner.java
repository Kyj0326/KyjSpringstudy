package com.skcc;

import java.util.Arrays;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{


	
	@Autowired
	ApplicationContext ctx; 
	
	//ApplicationContext로 해도되는데, (상속받고있으니까!) 코드는 그렇게 짜는게 아니다~
	@Autowired
	MessageSource msgSource;
	
	
	@Value("${app.about}")
	String appName;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
				Environment env = ctx.getEnvironment();
				System.out.println(Arrays.toString(env.getActiveProfiles()));
				System.out.println(Arrays.toString(env.getDefaultProfiles()));
				
				System.out.println(env.getProperty("app.about"));
				
				System.out.println(appName);
				
				
				
				
				
				
				
//				while(true) {
//				System.out.println(msgSource.getClass());
//				System.out.println(msgSource.getMessage("greeting", new String[]{"youngjae"},Locale.KOREA ));
//				
//				Thread.sleep(1000l);
//				}
				
	}
	
	

}
