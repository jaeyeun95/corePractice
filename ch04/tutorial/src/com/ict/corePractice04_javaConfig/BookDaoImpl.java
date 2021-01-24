package com.ict.corePractice04_javaConfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
// BookDaoImpl 이라고 하는 클래스를 spring bean 객체를 생성할 때 bookDao라고하는 id로 생성하겠다.
@Component("bookDao")
public class BookDaoImpl implements BookDao {

	private Map<Integer, Book> bookList;
	
	public BookDaoImpl() {
		bookList = new HashMap<>();
		bookList.put(1, new Book(1,123456,"자바의정석","남궁성","도우출판", new Date()));
		bookList.put(2, new Book(2,123222,"스프링의정석","이궁성","지노출판", new Date()));
		bookList.put(3, new Book(3,123333,"칭찬은 고래도 춤추게 한다","고래","바다출판", new Date()));
	}
	
	/**
	 * 도서 목록 전체를 리스트 형태로 리턴
	 */
	@Override
	public List<Book> selectBookList() {
		return new ArrayList<Book>(bookList.values());
	}

	/**
	 * 도서번호에 해당하는 Book 타입의 객체 리턴
	 */
	@Override
	public Book selectOneBook(int bookSequence) {
		return bookList.get(bookSequence);
	}

}
