package com.dev.todoList.service;

import java.util.List;

import com.dev.todoList.dto.TodoContent;
import com.dev.todoList.dto.User;

public interface TodoListService {
	
	
	
	//=======================================================
	// 기능 : UserSeq로  Todo Content 전체 조회
	// return : UserSeq랑 맞는 T_TODO_CONTENT 가져오기
	//=======================================================
	List<TodoContent> getAllTodoContent(User user);
	
	
	
	
}
