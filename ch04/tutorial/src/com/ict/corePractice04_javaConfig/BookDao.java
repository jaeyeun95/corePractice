package com.ict.corePractice04_javaConfig;

import java.util.List;

public interface BookDao {
	
	/**
	 * 도서목록 전체 조회
	 * @return
	 */
	List<Book> selectBookList();
	
	/**
	 * 도서번호로 도서 조회
	 * @param bookSequence
	 * @return
	 */
	Book selectOneBook(int bookSequence);

	
}
