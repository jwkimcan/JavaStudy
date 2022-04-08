package test;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input star length: ");
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

	}

}
