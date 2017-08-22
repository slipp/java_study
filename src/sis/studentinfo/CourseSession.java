package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	
	private String department = null;
	private String number = null;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate = null;
	private static int count;
	private int credits;

	private CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
		CourseSession.increaseCount();
	}
	
	public static CourseSession create(String department, String number, Date startDate) {
		return new CourseSession(department, number, startDate);
	}
	
	public static CourseSession createEnglish(Date startDate) {
		return new CourseSession("ENGL", "101", startDate);
	}
	
	public static CourseSession createMath(Date startDate) {
		return new CourseSession("MATH", "102", startDate);
	}
	
	private static void increaseCount() {
		count = count + 1;
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
		student.addCredits(credits);
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

	public static void resetCount() {
		count = 0;
	}
	
	public static int getCount() {
		return count;
	}

	public void setNumberOfCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	
}
