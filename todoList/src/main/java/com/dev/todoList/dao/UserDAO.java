package com.dev.todoList.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;

@Repository
public interface UserDAO {
	
	List<User> getAllUsers();
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
