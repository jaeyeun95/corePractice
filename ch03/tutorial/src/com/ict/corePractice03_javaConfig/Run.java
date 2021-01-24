package com.ict.corePractice03_javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

	public static void main(String[] args) {

		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.ict.corePractice03_javaConfig");
		
		Member member = (Member)context.getBean("memberGenerator");	//이름으로 가져올때는 다운캐스팅 객체로 가져오면 .class만
		
		System.out.println(member);
		System.out.println(member.getPersonalAccount().getBalacne());	//메소드에서 메소드 호출 
		System.out.println(member.getPersonalAccount().deposit(1000000));
		System.out.println(member.getPersonalAccount().getBalacne());
		System.out.println(member.getPersonalAccount().withDraw(300000));
		System.out.println(member.getPersonalAccount().getBalacne());
	}

}
