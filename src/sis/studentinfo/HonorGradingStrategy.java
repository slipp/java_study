package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class HonorGradingStrategy extends BasicGradingStrategy implements GradingStrategy{

	@Override
	public int getPoint(Grade grade) {
		if (grade == Grade.F) {
			return 0;
		}
		
		return super.getBasicPoint(grade) + 1;
	}
}
