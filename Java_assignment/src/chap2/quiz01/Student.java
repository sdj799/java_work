package chap2.quiz01;

public class Student extends Person {

	private String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	@Override
	String info(String name, int age) {
		return super.info(name, age);
	}

	
}
