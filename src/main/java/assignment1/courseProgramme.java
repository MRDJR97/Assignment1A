package assignment1;

import java.util.List;

import org.joda.time.DateTime;

public class courseProgramme {
	
	private String courseName;
	private List<Module> moduleList;
	private List<Student> studentList;
	private DateTime startDate;
	private DateTime endDate;
	
	public courseProgramme(String courseName, DateTime startDate,
			DateTime endDate) {
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void addModule(Module module){
		this.moduleList.add(module);
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Module> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
}
