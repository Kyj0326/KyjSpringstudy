package com.skccc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

 //언제까지 이 어노테이션을 유지 할 것인지 지정 class파일까지 한다는거다. 기본값이 class다~
//Source로 변경하면 컴파일하면 사라진다..
/*이 어노테이션을 사용하면 성능을 로깅해 줍니다.*/
@Retention(RetentionPolicy.CLASS)						
public @interface PerfLogging {

}
