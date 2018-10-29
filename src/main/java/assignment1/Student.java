package assignment1;

import java.util.List;

import org.joda.time.DateTime;

public class Student {
	
	private String name;
	private int age;
	private DateTime DOB;
	private int ID;
	private String username;
	private List<Module> registeredModules;
	
	public String getUsername() {
		return name+age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public DateTime getDOB() {
		return DOB;
	}
	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List getRegisteredCourses() {
		return registeredModules;
	}
	public void setRegisteredCourses(List registeredCourses) {
		this.registeredModules = registeredCourses;
	}
	
}
