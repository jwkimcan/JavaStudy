package test;

public class Pie {
	int rid;
	double pie = 3.14;

	double calculateArea() {
		double area = rid * rid * pie;
		return area;
	}

	double calculateRound() {
		double round = (2 * rid) * pie;
		return round;
	}

	double calculateArea(int count) {
		double area = calculateArea() * count;
		return area;
	}

}
