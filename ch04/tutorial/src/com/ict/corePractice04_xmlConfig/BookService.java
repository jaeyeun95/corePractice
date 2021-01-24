package com.ict.corePractice04_xmlConfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// 빈의 아이디는 @Component나 @Service, @Controller 이런 아이디가 붙으면 해당하는 클래스 메소드의
// 이름의 첫글자는 소문자로 변경되어 자동으로 아이디로 변경된다.
@Component
public class BookService {
	
//	private BookDao bDao = new BookDaoImpl();	그전에 사용하던 방법
	// BookDao 타입의 빈으로 생성된 객체를 @Autowired로 자동 연결시켜준다.
	@Autowired
	private BookDao bookDao;
	
	public BookService() {}
	
	public BookService(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	/**
	 * 도서 정보 전체 조회용 메소드
	 * @return
	 */
	public List<Book> selectAllBooks(){
		return bookDao.selectBookList();	//이거 때문에 DaoImpl을 먼저 만듦
	}
	
	/**
	 * 도서번호로 도서 검색용 메소드
	 * @param bookSequence
	 * @return
	 */
	public Book searchBookSequence(int bookSequence) {
		return bookDao.selectOneBook(bookSequence);
	}
}
