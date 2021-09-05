package com.dev.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.todoList.dao.TodoListDAO;
import com.dev.todoList.dto.TodoContent;
import com.dev.todoList.dto.User;
import com.dev.todoList.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService{

	
		@Autowired
		private TodoListDAO todoListDao;

		@Override
		public List<TodoContent> getAllTodoContent(User user) {
			return todoListDao.getAllTodoContent(user);
		}

		@Override
		public int getAddTodoSeq(int userSeq) {
			return todoListDao.getAddTodoSeq(userSeq);
		}

		@Override
		public int getAddContentSeq(int userSeq) {
			return todoListDao.getAddContentSeq(userSeq);
		}

		@Override
		public void insertNewTodoContent(TodoContent todoContent) {
			todoListDao.insertNewTodoContent(todoContent);
		}
		
		
	
}
