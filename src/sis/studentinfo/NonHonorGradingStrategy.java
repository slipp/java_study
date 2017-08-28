package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class NonHonorGradingStrategy extends BasicGradingStrategy implements GradingStrategy {

	@Override
	public int getPoint(Grade grade) {
		return super.getBasicPoint(grade);
	}

}
