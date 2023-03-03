package oop.constructor;

public class Bread {

	int price;
	String name;
	String ingredient;
	
	Bread() {} // 기본생성자는 있으면 좋음
	
	Bread(String bName , String bIngredient , int bPrice) {
		name = bName;
		ingredient = bIngredient;
		price = bPrice;
	}
	
	
	void info() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주 재료: " + ingredient);
	}
}
