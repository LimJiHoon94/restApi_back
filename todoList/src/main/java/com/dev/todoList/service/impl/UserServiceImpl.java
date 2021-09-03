package com.dev.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.todoList.dao.MembersDAO;
import com.dev.todoList.dao.UserDAO;
import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.MembersService;
import com.dev.todoList.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	

	//T_USER_INFO 마지막 USER_SEQ 조회
	@Override
	public int getUserInfoLastSeq() {
			
		return userDao.getUserInfoLastSeq();
	}
	
	//회원가입 처리
	@Override
	public int joinUser(User user) {
		return userDao.joinUser(user);
	}
	
	//id중복처리
	@Override
	public int idCheck(String id) {
		return userDao.idCheck(id);
	}

	//login count
	@Override
	public int loginCount(User user) {
		return userDao.loginCount(user);
	}
	
	//GetUser
	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}
	
	
	
	
	
	
}
