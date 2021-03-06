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
	
	//=======================================================
	// 기능 :  마지막 Todo_Seq +1 조회
	// return : 새로 추가할 Todo_Seq 조회
	//=======================================================
	int getAddTodoSeq();
	
	//=======================================================
	// 기능 : UserSeq로  TodoContent Count조회
	// return : 총 TodoContent Count 조회
	//=======================================================
	int  getTodoContentCount(int userSeq);
	
	//=======================================================
	// 기능 : UserSeq로 마지막 Content Seq +1 조회
	// return : 새로 추가할 Content Seq 조회
	//=======================================================
	int getAddContentSeq(int userSeq);
	
	//=======================================================
	// 기능 : T_TODO_CONTENT New INSERT
	// return : null
	//=======================================================
	void insertNewTodoContent(TodoContent todoContent);
	
	//=======================================================
	// 기능 : T_TODO_CONTENT DELLETE
	// return : null
	//=======================================================
	void deleteTodoContent(int TodoSeq);
	
	//=======================================================
	// 기능 : T_TODO_CONTENT DELETE All
	// return : null
	//=======================================================
	void deleteTodoContentAll(int TodoSeq);
	
	//=======================================================
	// 기능 : T_TODO_CONTENT State가 1인 LIST 조회
	// return : 완료한 CONTENT LIST
	//=======================================================
	List<TodoContent> getAllCompletionList(int userSeq);
	
	
}
