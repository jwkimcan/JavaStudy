package test;

public class Circle extends Shape {

	private int ri;

	public Circle(int ri) {
		super("원");
		this.ri = ri;

	}

	@Override
	public double calculateArea() {
		return (ri * ri) * 3.14;
	}
}
