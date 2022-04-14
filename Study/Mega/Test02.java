package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해 주세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d ", i, j, (i * j));
			}
			System.out.println();
		}
		System.out.println("===================");
		num1 = sc.nextInt();
		for (int i = 0; i < num1; i++) {
			for (int j = 1; j <= num1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=======================");
		int len = sc.nextInt();
		int n = (len / 2) + 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i + 1; j++) {

				System.out.print("-");
			}
			for (int j = 0; j < n - i; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			for (int j = 1; j < n - i; j++) {
				if (j % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			for (int j = 1; j < i + 1; j++) {
				System.out.print("-");
			}
			System.out.println("");
		}
		for (int i = 1; i < n; i++) {

			for (int j = n - i - 1; j > 0; j--) {
				System.out.print("-");
			}

			for (int j = 0; j < i + 1; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}

			for (int j = 0; j < i; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print("-");
			}

			System.out.println("");
		}
		System.out.println("======");
		System.out.println("삼각형 크기를 입력");
		num1 = sc.nextInt();
		int count = 1;

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
