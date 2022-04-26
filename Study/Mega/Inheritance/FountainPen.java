package test;

public class FountainPen extends Pen {
	private int amount; // 남은 량
	private String color; // 볼펜의 색

	public FountainPen() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void refill(int n) {
		setAmount(n);
	}

}
