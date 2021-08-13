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
	public List<Member> getAllMembers() {
		
		/*
		 * Member testMember = new Member(); testMember.setId(1);
		 * testMember.setName("testName"); testMember.setAge(15);
		 * testMember.setDept("서비스로 이동함!");
		 * 
		 * return testMember;
		 */
		//3
		return dao.getAllMembers();
	}
	
	@Override
	public Member getMember(Integer id) {
		return dao.getMember(id);
	}
	
	@Override
	public void insertMember(Member member) {
		 dao.insertMember(member);
	}
	
	@Override
	public Member updateMember(Integer id, Member member) {
		
		Member updateMember  = new Member();
		
		if(dao.updateMember(id,member) == 1) { 
			updateMember.setId(id);
			updateMember.setName(member.getName());
			updateMember.setAge(member.getAge());
			updateMember.setDept(member.getDept());
		}
		
		
		return updateMember;
	}

	@Override
	public Integer deleteMember(Integer id) {
		return dao.deleteMember(id);
	}
	
	
	
	
}
