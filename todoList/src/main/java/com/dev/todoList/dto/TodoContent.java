package com.dev.todoList.dto;

import java.sql.Date;

public class TodoContent {

	private int todoSeq;
	private int userSeq;
	private String content;
	private int seq;
	private int state;
	private Date createDate;
	private Date completionDate;
	
	public TodoContent() {
		super();
	}
	
	
	public int getTodoSeq() {
		return todoSeq;
	}
	
	public void setTodoSeq(int todoSeq) {
		this.todoSeq = todoSeq;
	}
	
	
	public int getUserSeq() {
		return userSeq;
	}
	
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getSeq() {
		return seq;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCteateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getCompletionDate() {
		return completionDate;
	}
	
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
