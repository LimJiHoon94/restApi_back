package com.dev.todoList.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dev.todoList.dto.TodoContent;
import com.dev.todoList.dto.User;

@Repository
public interface TodoListDAO {

	
	
	//=======================================================
	// 기능 : UserSeq로  Todo Content 전체 조회
	// return : UserSeq랑 맞는 T_TODO_CONTENT 가져오기
	//=======================================================
	List<TodoContent> getAllTodoContent(User user);

	
	
}
