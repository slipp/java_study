package sis.studentinfo;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;

public class CourseSessionTest {
	private CourseSession session;
    private Date startDate;

    @Before
    public void setup() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.FEBRUARY, 27);
        startDate = calendar.getTime();
        session = new CourseSession("ENGL", "101", startDate);
    }
	
    @Test
    public void create() throws Exception {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(startDate, session.getStartDate());
        assertEquals(0, session.getNumberOfStudents());

        Date endDate = session.getEndDate();
        assertEquals("2017-06-16", convertDateToString(endDate));
    }

    private String convertDateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    @Test
    public void enroll() throws Exception {
        Student firstStudent = new Student("재성");
        session.enroll(firstStudent);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(firstStudent, session.findStudent(0));

        Student secondStudent = new Student("주한");
        session.enroll(secondStudent);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(secondStudent, session.findStudent(1));
    }
}
