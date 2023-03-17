package chap2.quiz01;

public class Teacher extends Person {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	String info(String name, int age) {
		return super.info(name, age);
	}
	
	
}
