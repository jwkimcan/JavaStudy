package test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===========");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (sum > 100) {
				break;
			}
			sum += i;
		}
		System.out.println(sum);
		System.out.println("===========");
		System.out.println("숫자를 입력해주세요");
		int startNum = sc.nextInt();
		int cha = sc.nextInt();
		int count = sc.nextInt();
		int result = 0;
		for (int i = startNum; i <= cha * count; i += cha) {
			result = i;
		}
		System.out.println(result);
		System.out.println("===========");
		System.out.println("수를 입력 해주세요");
		num = sc.nextInt();
		count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("소수");
		} else {
			System.out.println("소수아님");
		}
		System.out.println(count);
		System.out.println("=============");
		Random rand = new Random();

		int youWin = 0;
		int computerWin = 0;
		for (int i = 0; i < 5; i++) {
			int computerPlay = rand.nextInt(3) + 1;
			System.out.print("가위(1) 바위(2) 보(3)!! : ");
			 num = sc.nextInt();
			if (youWin == 3 || computerWin == 3) {
				break;
			} else if (num == computerPlay) {
				System.out.println("computer :" + computerPlay);
				System.out.println("비겼으니 다시");
			} else if (num == 1 && computerPlay == 2) {
				System.out.println("computer :" + computerPlay);
				System.out.println("이겼습니다");
				youWin++;
			} else if (num == 2 && computerPlay == 3) {
				System.out.println("computer :" + computerPlay);
				System.out.println("이겼습니다~");
				youWin++;
			} else if (num == 3 && computerPlay == 1) {
				System.out.println("computer :" + computerPlay);
				System.out.println("이겼습니다~");
				youWin++;
			} else {
				System.out.println("computer :" + computerPlay);
				System.out.println("졌습니다");
				computerWin++;
			}
		}

		if (youWin > computerWin) {
			System.out.printf("최종결과 %d:%d로 당신이 이겼습니다~", youWin, computerWin);
		} else {
			System.out.printf("최종결과 %d:%d로 당신이 졌습니다~", youWin, computerWin);
		}
	}

}
