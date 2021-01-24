package com.ict.corePractice02_xmlConfig; 

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

// @Controller, @Service, @Repository : 각계층을 명확하게 구분할 때 지정
// @Component : pojo의 계층이 명확하지 않을 때 사용
@Component
public class MemberDaoImpl implements MemberDao {
	
//	private MemberDao mDao = new MemberDao();
//	
//	@Autowired
//	private Member dao;	@Autowired 때문에 자동으로 객체가 생성된다.
	
	//DB가 없으니 필드에 추가
	private final Map<Integer,Member> memberMap = new HashMap<>();
	
	public MemberDaoImpl() {
		memberMap.put(1, new Member(1,"user01","pass01","홍길동"));
		memberMap.put(2, new Member(1,"user02","pass02","유관순"));
	}

	/**
	 * 매개변수로 전달받은 회원번호를 map에서 조회 후 리턴해주는 용도의 메소드
	 */
	@Override
	public Member selectMember(int memberSequence) {
		return memberMap.get(memberSequence);
	}

	/**
	 * 매개변수로 전달받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean으로 리턴하는 메소드
	 */
	@Override
	public boolean insertMember(Member insertMember) {
		int before = memberMap.size();
		
		memberMap.put(insertMember.getMemberSequence(), insertMember);
		
		int after = memberMap.size();
		
		return (after > before) ? true : false;
	}

}
