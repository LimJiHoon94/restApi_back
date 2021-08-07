package com.dev.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.Member;
import com.dev.todoList.service.MembersService;

@RestController
public class MembersController {
	
	@Autowired
	private MembersService service;

	@GetMapping(path = "/test")
	public List<Member> memberTest() {
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
