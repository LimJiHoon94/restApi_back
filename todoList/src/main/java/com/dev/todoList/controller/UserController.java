package com.dev.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.todoList.dto.Member;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.MembersService;
import com.dev.todoList.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping(path = "/getallusers")
	public List<User> getAllUsers() {
		
		List<User> userList =  service.getAllUsers();
		
		for(int i = 0 ; i < userList.size(); i++) {
			System.out.println(userList.get(i).getId());
		}
		
		return service.getAllUsers();
	}
	  
	
	
	
	
	
}
