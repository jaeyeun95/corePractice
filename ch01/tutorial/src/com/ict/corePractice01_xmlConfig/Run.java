package com.ict.corePractice01_xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/corePractice01_xmlConfig/appConfig.xml");
		
		Member member = (Member)context.getBean("member");	//xml에서는 아이디지정, object로 가져오기때문에 다운캐스팅
				
		System.out.println(member);
		
		//다운캐스팅 말고 그냥 하는 방법 
		Member member2 = context.getBean("member",Member.class);   //"member", Member.class타입으로 가져오겠다
		System.out.println(member);
	}

}
