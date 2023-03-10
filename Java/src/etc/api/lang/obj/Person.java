package etc.api.lang.obj;

public class Person implements Cloneable {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {//Person 타입을 가질 수 있는지 먼저 검사
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if(this.name.equals(p.name)) {
				return true;
			}//밑에 false가 있으므로 else 생략
		} return false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동 호출(gc가 실행될 때)
		System.out.println(this.name + "이 소멸되었습니다.");
	}
	
	//객체 복사 메서드
	//cloneable 인터페이스를 구현해서 사용해야 합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public void personInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age + "세");
	}
	
	
	
}
