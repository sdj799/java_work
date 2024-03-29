package etc.generic.bad;

public class Main {

	public static void main(String[] args) {

		/*
		 Object 타입으로 선언하면 무엇이든 저장할 수는 있지만
		 반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
		 문제가 발생한다.
		 잘못 형 변환 했을 시에는 예외가 발생할 수도 있다. 
		 */
		
		Box box = new Box();
		box.setObj("홍길동");
		
		Box box2 = new Box();
		box2.setObj(new String("홍길동"));
		
		System.out.println(((String)box.getObj()).charAt(0));
		
		Box p = new Box();
		p.setObj(new Person());
		
		Person p2 = (Person)p.getObj();
	}

}
