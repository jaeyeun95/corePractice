package com.ict.corePractice01_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 이 클래스가 설정 메타 정보를 가지고 있다는 의미의 어노테이션
// 처음에 스프링 컨테이너 생성 시 현재 파일을 먼저 읽어들인다.
@Configuration
public class ApplicationConfig {	//환경설정관련파일이다.

	// 빈(Bean)등록
	// 스프링 컨테이너 로딩 시 현재 어노테이션이 붙은 메소드를 호출하여 객체를 생성 후 관리한다.
	// 이름을 아무것도 지정 안해주면, 메소드명과 동일하게 아이디의 bean이 생성된다.
	// 만약에 이름을 내가 지정하고 싶다 @Bean(name="myName" or @Bean("myName")으로 하면된다.
	//  ->어노테이션으로 빈의 이름을 설정하면 메소드명은 무시된다.
	@Bean
	public Member getMember() {
		return new Member(1,"user01","pass01","홍길동");
	}
}
 