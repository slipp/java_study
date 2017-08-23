package study;

import java.util.ArrayList;

import sis.studentinfo.Student;

public class CodesquadClass implements MyClass, YourClass {
	private ArrayList<Student> students = new ArrayList<>();

	public int countStudents() {
		return students.size();
	}

	public Student getStudent(String name) {
		return null;
	}
	
	public Student getStudent2(String name) {
		return null;
	}

	@Override
	public String getTeacherName() {
		return "재성";
	}
}
