package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수1 : ");
		int score1 = sc.nextInt();
		System.out.println("점수2 : ");
		int score2 = sc.nextInt();
		double avg = (score1 + score2) / 2.;
		if (score1 <= 50 || score2 <= 50) {
			System.out.println("과락");
		} else if (avg > 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("----------------");
		System.out.println("연도를 입력하시오.");

		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		System.out.println("-------");
		System.out.println("영희공격 :");
		int yu = sc.nextInt();
		System.out.println("철수공격 :");
		int ch = sc.nextInt();
		if (yu == ch) {
			System.out.println("비겼으니 다시");
		} else if (yu == 1 && ch == 2) {
			System.out.println("철수 승리~");
		} else if (yu == 2 && ch == 3) {
			System.out.println("철수 승리~");
		} else if (yu == 3 && ch == 1) {
			System.out.println("철수 승리~");
		} else {
			System.out.println("영희 승리~");
		}
		System.out.println("-------");

		System.out.println(" 시간 , 분 입력");
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m < 45) {
			h--;
			m = m + 15;
			System.out.printf("%d시 %d분", h, m);
		} else {
			System.out.printf("%d시 %d분", h, m - 45);
		}
		System.out.println("--------------");
		System.out.println("윷 상태를 입력해주세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4;
		switch (sum) {
		case 0 -> System.out.println("모");

		case 1 -> System.out.println("도");

		case 2 -> System.out.println("개");

		case 3 -> System.out.println("걸");

		case 4 -> System.out.println("윷");

		}
	}

}
