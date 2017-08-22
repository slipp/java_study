package sis.studentinfo;

public class Student {
	static final String IN_STATE = "경기도";
	String name;
	private int credits;
	private String state;
	
	public Student(String name) {
		this.name = name;
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
