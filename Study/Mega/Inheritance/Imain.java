package test;

import java.util.Scanner;

public class Imain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		IPhone ip = new IPhone();
		
		ip.infoString();
		ip.number();
		ip.internetBrowsing("https://www.google.com");
		System.out.println("어디로 전화 거실래요?");
		String num = sc.nextLine();
		ip.call(num);
		System.out.println("어디로 문자 보내실건가요요 ?");
		num = sc.nextLine();
		System.out.println("뭐라고요??");
		String text = sc.nextLine();
		ip.message(num, text);
	}

}
