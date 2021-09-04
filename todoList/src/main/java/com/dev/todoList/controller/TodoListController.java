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
	
	
	
	
	
}
