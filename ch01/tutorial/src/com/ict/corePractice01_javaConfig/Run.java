package com.ict.corePractice01_javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

	public static void main(String[] args) {

		// 스프링 IoC 컨테이너 생성
		// 설정 클래스 정보를 가지고 ApplicationContext 객체 생성
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// 스프링에서 관리하는 Bean의 타입에 맞춰서 객체를 컨테이너로부터 가져온다.
		Member member = context.getBean(Member.class);
		
		System.out.println(member);
	}

}
