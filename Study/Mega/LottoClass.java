package test;

import java.util.Random;
import java.util.Scanner;

public class LottoClass {
	private int lotto[] = new int[6];
	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public void AutoLotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = Math.abs(random.nextInt(45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
	}

	public void SelfLotto() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("번호를 입력해주세요");
			lotto[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("중복된 번호입니다");
					i--;
				}
			}
		}
		System.out.println("입력이 완료 되었습니다.");

	}

	public void Print() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
