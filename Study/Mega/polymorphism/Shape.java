package test;

public class Shape {
	private String name;

	

	public Shape(String name) {
		this.name = name;
	}

	// 넗이 구하는 메소드
	public double calculateArea() {
		return 0;
	}
	
	public void printArea() {
		System.out.println(this.name+"의 넓이는"+this.calculateArea()+"cm^2입니다");
	}

}
