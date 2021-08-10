package com.dev.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.Member;
import com.dev.todoList.service.MembersService;

@RestController
public class MembersController {
	
	@Autowired
	private MembersService service;
	
	@GetMapping(path = "/api/test")
	public String getTest() {
		System.out.println("TEST CONNECT");
		String names = "";
		List<Member> memberList =  service.getAllMembers();
		for(int i = 0 ; i < memberList.size(); i++) {
			//System.out.println(memberList.get(i).getName());
			names =names +  "," + memberList.get(i).getName();
		}
		
		
		return names;
	}
	
	@GetMapping(path = "/api/members")
	public List<Member> getAllMembers() {
		//1
		System.out.println("call");
		List<Member> memberList =  service.getAllMembers();
		for(int i = 0 ; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getName());
		}
		return service.getAllMembers();
	}
	
	@GetMapping(path = "/api/members/{id}")
	public Member getMember(@PathVariable Integer id) {
		return service.getMember(id);
	}
	
	/*
	 * @PostMapping(path = "/members") public Member insertMember(@RequestBody
	 * Member member) { service.insertMember(member); return member; }
	 */
	
	@PutMapping(path = "/api/members/{id}")
	public Member updateMember(@PathVariable Integer id, @RequestBody Member member) {
		return service.updateMember(id, member);
	}
	
	@DeleteMapping(path = "/api/members/{id}")
	public Integer deleteMember(@PathVariable Integer id) {
		return service.deleteMember(id);
	}
	
}
