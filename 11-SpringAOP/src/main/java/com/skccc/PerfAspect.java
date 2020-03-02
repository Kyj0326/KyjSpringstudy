package com.skccc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {
	
//	@Around("execution(* com.skcc.EventService.*(..))") //포인트컷도 정의한거다. com.skcc하위에 eventservice라는 클래스의 모든 메서드
//	@Around("@annotation(PerfLogging)") //deleteEvent에는 붙이기싫다..! PerfLogging 어노테이션붙은거만!
	@Around("bean(simpleEventService)") //그 빈이 가지고있는 모든 public메서드에 적용이 된다~
	public Object logPerf(ProceedingJoinPoint pjp) throws Throwable { //이거자체가 advice다! Around어드바이스를 사용하겠따. ( 그 메서드를 실행시키는 행위를 감싸서 하는 행위를 말한다)
		long begin = System.currentTimeMillis();
		
		Object retVal = pjp.proceed(); // 메서드 그자체를 얘기한다. 이거는 메서드를 실행시키는 행위이다. (createEvent, pulishEvent~~) 
										//그 메서드를  실행시킨 결과를 Object로 받는거다~
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
		
	}

	@Before("bean(simpleEventService)")
	public void hello() {
		System.out.println("hello");
	}
	
	
	
	
}
