package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public abstract class BasicGradingStrategy {
	protected int getBasicPoint(Grade grade) {
		return grade.getGrade();
	}
}
