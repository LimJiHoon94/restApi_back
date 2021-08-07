package com.dev.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.todoList.dao.MembersDAO;
import com.dev.todoList.dto.Member;
import com.dev.todoList.service.MembersService;

@Service
public class MemberServiceImpl implements MembersService {

	@Autowired
	private MembersDAO dao;
	
	@Override
	public List<Member> testMember() {
		
		/*
		 * Member testMember = new Member(); testMember.setId(1);
		 * testMember.setName("testName"); testMember.setAge(15);
		 * testMember.setDept("서비스로 이동함!");
		 * 
		 * return testMember;
		 */
		return dao.testMember();
	}
	
}
