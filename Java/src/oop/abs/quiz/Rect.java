package oop.abs.quiz;

public class Rect extends Shape {

	int length;
	
	public Rect(String name, int length) {
		super(name);
		this.length = length;
	}

	@Override
	public double getArea() {
		return length*length;
	}

}
