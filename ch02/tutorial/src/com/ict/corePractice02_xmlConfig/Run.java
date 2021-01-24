package com.ict.corePractice02_xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Run {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("com/ict/corePractice02_xmlConfig/configuration/appConfig.xml");
		
		MemberDao memberDao = context.getBean(MemberDao.class);
//		MemberDao memberDao = new MemberDaoImpl(); 와 같은 뜻
		System.out.println(memberDao.selectMember(1));
		System.out.println(memberDao.insertMember(new Member(3,"user03","pass03","새로운멤버")));
		System.out.println(memberDao.selectMember(3));
	}

}
