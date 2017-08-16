package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;

	public CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getNumber() {
		return number;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		students.add(student);
	}
	
	public void drop(Student student) {
		students.remove(student);
	}
	
	public Student findStudent(int index) {
		return students.get(index);
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_YEAR, 16 * 7 - 3);
		return calendar.getTime();
	}
}
