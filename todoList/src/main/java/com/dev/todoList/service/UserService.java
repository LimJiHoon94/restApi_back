package com.dev.todoList.service;

import java.util.List;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

public interface UserService {
	
	
	//T_USER_INFO 마지막 USER_SEQ 조회
	int getUserInfoLastSeq();
	
	
	//회원가입 처리
	int joinUser(User user);
	
	//아이디 중복 확인
	int idCheck(String id);
	
	//login count 
	int loginCount(User user);
	
		
	
}
