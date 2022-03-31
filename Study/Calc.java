package st.com;

import java.util.Scanner;

public class Calc {
	int sum(int a, int b) {

		return a + b;

	}

	int min(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		System.out.println("계산을 원하시는 2개의 숫자를 입력해주세요 ");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		System.out.printf("덧셈:%d\n뺄셈:%d\n곱셈:%d\n나눗셈:%d", calc.sum(num1, num2), calc.min(num1, num2),
				calc.mul(num1, num2), calc.div(num1, num2));

	}

}
