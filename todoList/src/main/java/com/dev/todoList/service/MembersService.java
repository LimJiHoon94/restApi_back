package com.dev.todoList.service;

import java.util.List;

import com.dev.todoList.dto.Member;

public interface MembersService {
	
	//2
	List<Member> getAllMembers();
	
	Member getMember(Integer id);
	
	void insertMember(Member member);
	
	Member updateMember(Integer id , Member member);
	
	Integer deleteMember(Integer id);
	
}
