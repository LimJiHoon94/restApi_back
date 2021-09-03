package com.dev.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.MembersService;
import com.dev.todoList.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	//====================================================================
	// API : http://localhost:8080/api/user/membershipJoin
	// 기능 : 회원가입
	// Parameter : ID , PW , E-MAIL , NAME
	//====================================================================
	@PostMapping(path="/membershipJoin")
	public int membershipJoin(User user) {
		//비즈니스 변수
		int bisProcess = 0;
		
		//seq 받기
		int userSeq = service.getUserInfoLastSeq();
		user.setUserSeq(userSeq);
		
		int joinProcess = service.idCheck(user.getId());
		System.out.println("joinProcess : " + joinProcess);
		if(joinProcess >= 1 ) {
			bisProcess = 1;
		}else {
			service.joinUser(user);
		}
		
		return bisProcess;
	}
	//====================================================================
	// API : http://localhost:8080/api/user/loginRun
	// 기능 : 로그인
	// Parameter : ID , PW 
	//====================================================================
	@PostMapping(path = "/loginRun")
	public int loginRun(User user) {
		
		//login 정보로 count 확인
		int bisProcess = service.loginCount(user);
		
		return bisProcess;
	}
	
	
	//====================================================================
	// API : http://localhost:8080/api/user/getUser
	// 기능 : 유저정보 가져오기
	// Parameter : ID , PW 
	//====================================================================
	@PostMapping(path = "/getUser")
	public User getUser(User user) {
		
		return service.getUser(user);
	}
	
	
}
