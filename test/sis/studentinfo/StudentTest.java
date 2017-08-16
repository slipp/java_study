package sis.studentinfo;

import static org.junit.Assert.assertEquals;

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
}
