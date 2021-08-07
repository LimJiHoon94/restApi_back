package com.dev.todoList.dto;


/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;*/

/*@Setter
@Getter
@ToString
@AllArgsConstructor*/
public class Member {
	private Integer id;
	private String name;
	private Integer age;
	private String dept;
	
	public Member() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "MEMBER[id = "+ id + ", name = " + name + ", age = "+ age + ", dept = "+ dept + "]";
	}
	
	
}
