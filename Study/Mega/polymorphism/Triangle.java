package test;

public class Triangle extends Shape {
	private int width;
	private int height;

	public Triangle(int width, int height) {
		super("삼각형");
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height/2.;
	}
}
