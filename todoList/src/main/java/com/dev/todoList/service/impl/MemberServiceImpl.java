package com.dev.todoList.service.impl;

import org.springframework.stereotype.Service;

import com.dev.todoList.dto.Member;
import com.dev.todoList.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public Member testMember() {
		
		Member testMember = new Member();
		testMember.setId(1);
		testMember.setName("testName");
		testMember.setAge(15);
		testMember.setDept("서비스로 이동함!");
		
		return testMember;
	}
	
}
