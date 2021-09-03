package com.dev.todoList.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

@Repository
public interface UserDAO {
	
	//=======================================================
	// 기능 : T_USER_INFO 마지막 USER_SEQ 조회
	// return : DB의 마지막 T_USER_INFO SEQ 가져오기
	//=======================================================
	int getUserInfoLastSeq();
	
	//=======================================================
	// 기능 : 회원가입 처리
	// return : 유저 생성처리 count
	//=======================================================
	int joinUser(User user);
	
	//=======================================================
	// 기능 : 아이디 중복 확인
	// return : T_USER_INFO 아이디 중복 수
	//=======================================================
	int idCheck(String id);
	
	//=======================================================
	// 기능 : login시 ID PW에 맞는 USER 수 조회 
	// return : login시 ID PW에 맞는 USER수
	//=======================================================
	int loginCount(User user);
	
	//=======================================================
	// 기능 : login시 ID PW에 맞는 USER 정보 조회 
	// return : ID PW에 맞는 USER정보 조회
	//=======================================================	
	User getUser(User user);
}
