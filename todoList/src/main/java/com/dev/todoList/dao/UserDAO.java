package com.dev.todoList.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

@Repository
public interface UserDAO {
	
	//T_USER_INFO 마지막 USER_SEQ 조회
	int getUserInfoLastSeq();
	
	//회원가입 처리
	int joinUser(User user);
	
	//아이디 중복 확인
	int idCheck(String id);
	
	//login count 
	int loginCount(User user);
}
