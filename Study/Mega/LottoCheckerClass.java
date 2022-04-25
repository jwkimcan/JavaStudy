package test;

import java.util.Random;

public class LottoCheckerClass {
	private int result[] = new int[6];
	Random random = new Random();
	int count = 0;

	public void ResultLotto() {
		for (int i = 0; i < result.length; i++) {
			result[i] = Math.abs(random.nextInt(45) + 1);
			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					i--;
				}
			}
		}
	}

	public void Print() {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public void checkResult(LottoClass lc) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (this.result[i] == lc.getLotto()[j]) {
					count++;
				}
			}
		}

		System.out.print("당첨 번호 :");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println("내번호 :");
		for (int i = 0; i < result.length; i++) {
			System.out.print(lc.getLotto()[i] + " ");
		}
		System.out.println();
		if (count == 6) {
			System.out.println("1등 당첨!!!!!!");
		} else if (count == 5) {
			System.out.println("2등 당첨!!!!!!");
		} else if (count == 4) {
			System.out.println("3등 당첨!!!!!!");
		} else if (count == 3) {
			System.out.println("4등 당첨!!!!!!");
		} else if (count == 2) {
			System.out.println("5등 당첨!!!!!!");
		} else {
			System.out.println("꽝 ㅜ");
		}

	}
}