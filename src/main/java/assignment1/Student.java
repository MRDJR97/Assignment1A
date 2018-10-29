package assignment1;

import java.util.List;

import org.joda.time.DateTime;

public class Student {
	
	private String name;
	private int age;
	private DateTime DOB;
	private static int ID;
	private String username;
	private List<Module> registeredModules;
	private List<courseProgramme> registeredCourses;
	private int id;
	
	public Student(String name, int age, DateTime dOB, int iD) {
		this.name = name;
		this.age = age;
		DOB = dOB;
		this.id = ID;
		ID++;
	}
	
	//for test only
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public void enrollForCourse(courseProgramme course){
		this.registeredCourses.add(course);
		course.registeredStudents.add(this);
		for(Module module : course.getModuleList()){
			this.registeredModules.add(module);
			module.enrollStudent(this);
		}
	}
	
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
	public List getRegisteredModules() {
		return registeredModules;
	}
	public void setRegisteredModules(List registeredModules) {
		this.registeredModules = registeredModules;
	}
	public List getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(List registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
}
