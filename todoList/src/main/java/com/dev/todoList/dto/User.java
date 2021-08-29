package com.dev.todoList.dto;

import java.sql.Date;

//import java.util.Date;

/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;*/

/*@Setter
@Getter
@ToString
@AllArgsConstructor*/
public class User {
	
	private int userSeq;
	private String id;
	private String pw;
	private String userName;
	private String eMail;
	private int userLevel;
	private Date createDate;
	
	public User() {
		super();
	}
	
	public int getUserSeq() {
		return userSeq;
	}
	
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEMail() {
		return eMail;
	}
	
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public int getUserLevel() {
		return userLevel;
	}
	
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "USER[id = "+ id + ", userSeq = " + userSeq + ", pw = "+ pw + ", createDate = "+ createDate + "]";
	}
	
	
}
