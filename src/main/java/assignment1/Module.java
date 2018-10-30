package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private String name;
	private String ID;
	private List<Student> studentsEnrolled = new ArrayList();
	private List<courseProgramme> courses = new ArrayList();
	
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
	public List<courseProgramme> getCourses() {
		return courses;
	}
	public void setCourses(List<courseProgramme> courses) {
		this.courses = courses;
	}
	
	public void enrollStudent(Student student) {
		this.studentsEnrolled.add(student);
	}

	public void registerForCourse(courseProgramme courseProgramme) {
		this.courses.add(courseProgramme);
		
	}
}
