package test;

public class Pro {
	String name;
	int pay;
	String day;

	int mulPay(int count) {
		int area = count * pay;
		return area;
	}

	public void expirationdate() {
		String[] days = day.split("-");
		int y = Integer.parseInt(days[0]);
		int m = Integer.parseInt(days[1]);
		int d = Integer.parseInt(days[2]);

		if (y < 2022 && m < 4 && d < 21) {
			System.out.println("유통 기한이 지난 상품");
		} else {
			System.out.println("판매 가능 상품");
		}

	}
}
