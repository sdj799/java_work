package oop.abs.quiz;

public class Rect extends Shape {

	int length;
	int width;
	int height;
	
	public Rect(String name, int length) {
		super(name);
		this.length = length;
	}
	
	

	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}



	@Override
	public double getArea() {
		if(length != 0) {
			return length*length;
		}else {
			return width * height;
		}
		
	}

}
