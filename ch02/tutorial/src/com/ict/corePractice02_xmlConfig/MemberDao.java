package com.ict.corePractice02_xmlConfig;

public interface MemberDao {

	/**
	 * 회원번호로 회원정보를 조회하는 메소드
	 * @param memberSequence
	 * @return
	 */
	Member selectMember(int memberSequence);
	
	/**
	 * 회원정보를 저장하고 결과를 리턴하는 메소드
	 * @param insertMember
	 * @return
	 */
	boolean insertMember(Member insertMember);
	
}
