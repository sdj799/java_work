package chap02.quiz01;

public class Person {

	private String name;
	private int age;
	
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String info(String name, int age) {
		
		return "이름: "+ name + ", 나이: "+age + "세";
	}
}
