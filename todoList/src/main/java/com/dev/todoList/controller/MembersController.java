package com.dev.todoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.Member;
import com.dev.todoList.service.MemberService;

@RestController
public class MembersController {
	
	@Autowired
	private MemberService service;

	@GetMapping(path = "/test")
	public Member memberTest() {
		/*
		 * Member testMember = new Member();
		 * 
		 * testMember.setId(1); testMember.setName("testName"); testMember.setAge(15);
		 * testMember.setDept("test");
		 */
		
		//return testMember;
		return service.testMember();
	}
	
}
