package assignment1;

import java.util.List;

public class Module {

	private String name;
	private String ID;
	private List<Student> studentsEnrolled;
	private List<String> courses;
	
	public Module(String name, String iD) {
		this.name = name;
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public List<Student> getStudentsEnrolled() {
		return studentsEnrolled;
	}
	public void setStudentsEnrolled(List<Student> studentsEnrolled) {
		this.studentsEnrolled = studentsEnrolled;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public void enrollStudent(Student student) {
		this.studentsEnrolled.add(student);
	}
}
