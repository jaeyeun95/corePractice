package com.ict.corePractice03_javaConfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ict.corePractice03_javaConfig.Account;
import com.ict.corePractice03_javaConfig.Member;
import com.ict.corePractice03_javaConfig.PersonalAccount;

@Configuration	//이 클래스가 설정파일인 것을 알려줌
public class MemberConfiguration {	

	@Bean
	public Account accountGenerator() {
		return new PersonalAccount(20,"110-123-456789","1234");	//은행코드, 계좌번호, 비밀번호
	}
	
	@Bean
	public Member memberGenerator() {
		// 의존성 주입(DI) : 생성자를 통한 의존성 주입
		//return new Member(1,"홍길동","010-1234-5678","hong123@gmail.com",accountGenerator());
		
		// 의존성주입(DI) : setter를 이용한 의존성 주입
		// 생성자를 통해 Member객체를 생성한 것 -> 기본생성자와 setter를 사용하는 방법으로 교체
		Member member = new Member();
		Account account = accountGenerator();
		
		member.setMemberSequence(1);
		member.setMemberName("홍길동");
		member.setPhone("010-1234-5678");
		member.setEmail("hong123@gmail.com");
		member.setPersonalAccount(account);
		
		return member;
	}
}
