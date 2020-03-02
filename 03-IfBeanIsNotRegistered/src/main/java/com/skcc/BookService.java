package com.skcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	 
	BookRepository bookRepository;
	
	@Autowired(required = false) // BookRepository에서 @Repository를 지웠을 때 (빈으로 등록이 안됐을 때) 빈으로 등록이 안됐는데 오토와이어드 하라고 했기때문에 required false를 주지 않으면 에러가 발생한다.(기본값은 true이다)  
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
 //required를 안넣고 했을 땐 에러가 발생한다. 왜냐면 컨테이너에 주입시킬 빈이 없기때문이다.
}
