package com.dev.todoList.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

@Repository
public interface UserDAO {
	
	//전체 사용자 조회
	List<User> getAllUsers();
	
	//마지막 User_Seq
	int lastUserSeq();
		
	//시용자 생성
	void createUser(String id,
			String pw,
			String snsYn);
	
	//T_USER_INFO 마지막 USER_SEQ 조회
	int getUserInfoLastSeq();
	
	
	//4
	/*
	 * List<Member> getAllMembers();
	 * 
	 * Member getMember(Integer id);
	 * 
	 * void insertMember(Member member);
	 * 
	 * int updateMember(@Param("id") Integer id , @Param("member") Member member);
	 * 
	 * Integer deleteMember(Integer id);
	 */
}
