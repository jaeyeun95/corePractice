package com.ict.corePractice03_javaConfig;

public interface Account {

	/**
	 * 잔액조회
	 * @return 잔액
	 */
	String getBalacne();

	/**
	 * 입금
	 * @param money
	 * @return 입금 후 잔액
	 */
	String deposit(int money);
	
	/**
	 * 출금
	 * @param money
	 * @return 출금된 후 잔액
	 */
	String withDraw(int money);
}
