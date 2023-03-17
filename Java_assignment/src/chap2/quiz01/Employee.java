package chap2.quiz01;

public class Employee extends Person {

	private String departments;

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	@Override
	String info(String name, int age) {
		return super.info(name, age);
	}
	
	
}
