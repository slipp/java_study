package sis.report;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import sis.studentinfo.CourseSession;

public class CourseReporterTest {
	  @Test
	  public void report() throws Exception {
	    final Date date = new Date();
	    CourseReport report = new CourseReport();
	    report.add(CourseSession.create("KOR", "110", date));
	    report.add(CourseSession.create("ENGL", "201", date));
	    report.add(CourseSession.create("KOR", "102", date));
	    report.add(CourseSession.create("CHN", "313", date));
	    report.add(CourseSession.create("CHN", "301", date));

	    assertEquals(
	    		"CHN 301" + RosterReporter.NEWLINE + 
	    		"CHN 313" + RosterReporter.NEWLINE + 
	    		"ENGL 201" + RosterReporter.NEWLINE +
	    		"KOR 102" + RosterReporter.NEWLINE +
	    		"KOR 110" + RosterReporter.NEWLINE
	        , report.text());
	}
}
