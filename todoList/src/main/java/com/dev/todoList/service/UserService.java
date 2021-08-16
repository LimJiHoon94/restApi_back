package com.dev.todoList.service;

import java.util.List;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

public interface UserService {
	
	
	//전체 사용자 조회
	List<User> getAllUsers();
	
	//마지막 User_Seq
	int lastUserSeq();
	
	//시용자 생성
	void createUser(String id,
					String pw,
					String snsYn);
	
	/*
	 * List<Member> getAllMembers();
	 * 
	 * Member getMember(Integer id);
	 * 
	 * void insertMember(Member member);
	 * 
	 * Member updateMember(Integer id , Member member);
	 * 
	 * Integer deleteMember(Integer id);
	 */
	
}
