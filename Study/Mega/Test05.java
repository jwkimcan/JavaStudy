package test;

import java.util.Scanner;

public class Test05 {
	String jjak(int a) {
		if (a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("세개의 수를 입력 하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		Test05 jjak = new Test05();
		String result = jjak.jjak(num1);
		System.out.println(result);
		result = jjak.jjak(num2);
		System.out.println(result);
		result = jjak.jjak(num3);
		System.out.println(result);
		System.out.println("---------------");
		System.out.println("BMI 수치를 입력해주세요");
		double bmi = sc.nextDouble();
		if (bmi > 20) {
			System.out.println("비만중");
		} else if (bmi > 10) {
			System.out.println("과체중");
		} else {
			System.out.println("정상");
		}
		System.out.println("---------------");
		System.out.println("두 점수를 입력해 주세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		double avg = (num1 + num2) / 2.;
		if (avg >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("--------------");
		System.out.println("세 수를 입력 하세요 ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		int max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		System.out.println(max);
		System.out.println("-----------------");
		System.out.println("계절을 입력해 주세요");
		int month = sc.nextInt();
		switch (month) {
		case 3, 4, 5 -> System.out.println("봄");

		case 6, 7, 8 -> System.out.println("여름");

		case 9, 10, 11 -> System.out.println("가을");

		case 12, 1, 2 -> System.out.println("겨울");

		}
	}
}