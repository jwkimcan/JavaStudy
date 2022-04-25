package test;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 임의의 숫자를 얻어내는 방법

//		Random random = new Random();
//		
//		int number = random.nextInt() % 45;
//		System.out.println(number);
//		
//		

		LottoClass lc = new LottoClass();
		LottoCheckerClass lcc = new LottoCheckerClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("자동으로 구매하시겠습니까?? \n수동으로 구매하시겠습니까");
		String kind = sc.nextLine();
		if (kind.equals("자동")) {
			lc.AutoLotto();
		} else {
			lc.SelfLotto();
		}

//		lc.Print();
		System.out.println();
		lcc.ResultLotto();// 당첨번호 생성
//		lcc.Print();
		lcc.checkResult(lc);
	}

}
