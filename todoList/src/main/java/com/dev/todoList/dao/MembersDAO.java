package com.dev.todoList.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.Member;

@Repository
public interface MembersDAO {
	
	List<Member> testMember();
	
}
