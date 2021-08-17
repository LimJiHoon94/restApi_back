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
	
	//전체 사용자 조회
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	//시용자 생성
	@Override
	public void createUser(String id, String pw, String snsYn) {
		userDao.createUser(id, pw, snsYn);
	}

	//마지막 User_Seq 
	@Override
	public int lastUserSeq() {
		return userDao.lastUserSeq();
	}

	//T_USER_INFO 마지막 USER_SEQ 조회
	@Override
	public int getUserInfoLastSeq() {
			
		return userDao.getUserInfoLastSeq();
	}
	
	/*
	 * @Override public Member getMember(Integer id) { return dao.getMember(id); }
	 * 
	 * @Override public void insertMember(Member member) { dao.insertMember(member);
	 * }
	 * 
	 * @Override public Member updateMember(Integer id, Member member) {
	 * 
	 * Member updateMember = new Member();
	 * 
	 * if(dao.updateMember(id,member) == 1) { updateMember.setId(id);
	 * updateMember.setName(member.getName()); updateMember.setAge(member.getAge());
	 * updateMember.setDept(member.getDept()); }
	 * 
	 * 
	 * return updateMember; }
	 * 
	 * @Override public Integer deleteMember(Integer id) { return
	 * dao.deleteMember(id); }
	 */
	
	
	
}
