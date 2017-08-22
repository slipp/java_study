package sis.studentinfo;

import static org.junit.Assert.*;

import org.junit.Test;

import sis.studentinfo.Student;

public class StudentTest {

	@Test
	public void create() {
		Student student = new Student("재성");

		assertEquals("재성", student.getName());

		Student student2 = new Student("주한");
		String studentName2 = student2.getName();
		assertEquals("주한", studentName2);
	}
	
	@Test
	  public void inState() throws Exception {
	    Student student = new Student("a");
	    assertFalse(student.isInState());

	    student.setState(Student.IN_STATE);
	    assertTrue(student.isInState());

	    student.setState("서울특별시");
	    assertFalse(student.isInState());
	  }

	@Test
	public void credits() throws Exception {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());

		student.addCredits(3);
		assertEquals(3, student.getCredits());

		student.addCredits(4);
		assertEquals(7, student.getCredits());
		
		assertFalse(student.isFullTime());
		
		student.addCredits(5);
		assertTrue(student.isFullTime());
	}

}
