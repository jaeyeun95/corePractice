package com.ict.corePractice02_javaConfig.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
// 기본적으로 스프링은 @Configuration, @Bean, @Component, @Repository, @Service, @Controller가 달린
// 클랫는 모두 감지한다.
//@Configuration
//public class MemberConfiguration {
//
//}
import org.springframework.context.annotation.FilterType;

import com.ict.corePractice02_javaConfig.MemberDao;
@Configuration
// @ComponentScan 어노테이션을 이용하여 스캔과정을 커스터마이징 해보자
@ComponentScan(basePackages = "com.ict.corePractice02_javaConfig",	//"com.ict.corePractice02_javaConfig"를 가져와 달라
		// 스캐닝에 포함할 내용을 작성
				includeFilters = {
						@ComponentScan.Filter(
								type=FilterType.REGEX,	//pattern을 사용하겠다(*Dao, *Service 전체를 사용하겠다)
								pattern = {"com.ict.corePractice02_javaConfig.*Dao",
										"com.ict.corePracitce02_javaConfig.*Service"} 
							)
					},
				// 스캐닝에서 제외할 내용을 작성하는 부분
				excludeFilters = {
						@ComponentScan.Filter(
//									type=FilterType.ANNOTATION,	// 어떤 ANNOTATION을 제외할 것인지 의미
//									classes= {org.springframework.stereotype.Component.class}
								
								type=FilterType.ASSIGNABLE_TYPE,	///ASSIGNABLE_TYPE는 클래스나 인터페이스를 지정해서 제외시킴
								classes= {MemberDao.class}
								)
				}
				)	

public class MemberConfiguration {

}

//  스프링이 지원하는 필테는 네종류
// ANNOTATION : 필터 대상 어노테이션 타입을 지정해서 매칭하는 용도
// ASSIGNABLE_TYPE : 클래스/인터페이스를 지정하여 매칭하는 용도
// REGEX : 정규표현식으로 클래스를 매칭하는 용도
// ASPECTJ : 포인트컷 표현식으로 클래스를 매칭하는 용도
