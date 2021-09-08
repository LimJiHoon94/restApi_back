package com.dev.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.TodoContent;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.TodoListService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/todoList")
public class TodoListController {

	
	@Autowired
	private TodoListService service;
	
	//====================================================================
	// API : http://localhost:8080/api/todoList/membershipJoin
	// 기능 : UserSeq로  Todo Content 전체 조회
	// Parameter : User Seq
	//====================================================================
	@PostMapping(path = "/getAllTodoContent")
	public List<TodoContent> getAllTotoContent(User user){
		return service.getAllTodoContent(user); 
	}
	
	//====================================================================
	// API : http://localhost:8080/api/todoList/AddTodoContent
	// 기능 : T_TODO_CONTENT에 Insert
	// Parameter : User Seq , Content
	//====================================================================	
	@PostMapping(path = "/AddTodoContent")
	public List<TodoContent> addTodoContent(String userSeq , String content){
		int todoCount = service.getTodoContentCount(Integer.parseInt(userSeq));
		
		//최초 생성시 예외처리
		if(todoCount == 0) {
			int addTodoSeq = service.getAddTodoSeq();
			
			TodoContent todoContent = new TodoContent();
			todoContent.setTodoSeq(addTodoSeq);
			todoContent.setSeq(1);
			todoContent.setContent(content);
			todoContent.setUserSeq(Integer.parseInt(userSeq));
			
			service.insertNewTodoContent(todoContent);
			
		}else {
			
			int addTodoSeq = service.getAddTodoSeq();
			int addContentSeq = service.getAddContentSeq(Integer.parseInt(userSeq));
			
			TodoContent todoContent = new TodoContent();
			todoContent.setTodoSeq(addTodoSeq);
			todoContent.setSeq(addContentSeq);
			todoContent.setContent(content);
			todoContent.setUserSeq(Integer.parseInt(userSeq));
			
			service.insertNewTodoContent(todoContent);
			
		}
		
		User user = new User();
		user.setUserSeq(Integer.parseInt(userSeq));
		
		return service.getAllTodoContent(user);
	}
	
	//====================================================================
	// API : http://localhost:8080/api/todoList/DeleteTodoContent
	// 기능 : T_TODO_CONTENT에 Delete
	// Parameter : User Seq , Todo Seq
	//====================================================================	
	@PostMapping(path = "/DeleteTodoContent")
	public List<TodoContent> DeleteTodoContent(String todoSeq, String userSeq) {
		service.deleteTodoContent(Integer.parseInt(todoSeq));
		
		User user = new User();
		user.setUserSeq(Integer.parseInt(userSeq));
		
		return service.getAllTodoContent(user); 
	}
	
	//====================================================================
	// API : http://localhost:8080/api/todoList/DeleteTodoContentAll
	// 기능 : T_TODO_CONTENT에 전체 Delete
	// Parameter : User Seq 
	//====================================================================	
	@PostMapping(path = "/DeleteTodoContentAll")
	public void DeleteTodoContent(String userSeq) {
		service.deleteTodoContentAll(Integer.parseInt(userSeq));
		
	}
	
	
}
