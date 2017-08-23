package sis.report;

import java.util.ArrayList;
import java.util.Collections;

import sis.studentinfo.CourseSession;

public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<>();
	
	public void add(CourseSession session) {
		sessions.add(session);
	}

	public String text() {
		Collections.sort(sessions);
		StringBuilder sb = new StringBuilder();
		for (CourseSession session : sessions) {
			sb.append(session.getDepartment());
			sb.append(" ");
			sb.append(session.getNumber());
			sb.append(RosterReporter.NEWLINE);
		}
		return sb.toString();
	}

	
}
