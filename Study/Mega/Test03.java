package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		while (num < 8) {
			System.out.println("Hello World");
			num++;
		}
		System.out.println("=========");
		num = 2;
		while (num <= 10) {
			System.out.println(num);
			num += 2;
		}
		System.out.println("=========");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = sc.nextInt();
		for (int i = 1; i <= 100; i++) {
			if (i % num != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=========");
		num = 0;
		while (true) {
			System.out.println("수를 입력해주세요");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}

		}
		System.out.println("끝");
	}

}
