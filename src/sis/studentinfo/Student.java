package sis.studentinfo;

import java.util.LinkedList;
import java.util.List;

public class Student {
	public enum Grade {
		A, B, C, D, F;
	}
	
	static final String IN_STATE = "경기도";
	String name;
	private int credits;
	private String state;
	private List<Grade> grades = new LinkedList<>();
	private GradingStrategy gradingStrategy;
	
	public Student(String name) {
		this.name = name;
	}
	
	public List<Grade> getGrades() {
		return grades;
	}
	
	public void setGradingStrategy(GradingStrategy gradingStrategy) {
		this.gradingStrategy = gradingStrategy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public void addCredits(int credits) {
		this.credits += credits;
	}
	
	public boolean isFullTime() {
		return this.credits >= 12;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public boolean isInState() {
        if (state == null) {
            return false;
        }

        return state.equals(Student.IN_STATE);
    }
	
	public void addGrade(Grade grade) {
		grades.add(grade);
	}
	
	public double getGpa() {
		if (grades.isEmpty()) {
			return 0.0;
		}
		
		double total = 0.0;
		for (Grade grade : grades) {
			total += gradingStrategy.getPoint(grade);
		}
		return total / grades.size();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
