package test;

import java.util.Scanner;

public class Test04S {
	public static void Score(String v, String l, String c, String n) {
		int score = 0;
		if (v.equals("victory")) {
			score = score + 25;
		}
		if (l.equals("love")) {
			score = score + 25;
		}
		if (c.equals("computer")) {
			score = score + 25;
		}
		if (n.equals("notebook")) {
			score = score + 25;
		}

		System.out.printf("점수는 %d점입니다", score);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String[] files = { "cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg" };
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("jpg")) {
				count++;
			}
		}
		System.out.println("jpg파일의 개수" + count);
		System.out.println("==============");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 승리를 영어로 입력하세요 :");
		String victory = sc.nextLine();
		System.out.println("2. 사랑을 영어로 입력하세요 :");
		String love = sc.nextLine();
		System.out.println("3. 컴퓨터를 영어로 입력하세요 :");
		String computer = sc.nextLine();
		System.out.println("4. 노트북을 영어로 입력하세요 :");
		String notebook = sc.nextLine();
		Score(victory, love, computer, notebook);
		System.out.println();
		System.out.println("=================");
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = membersString.split(":");
		count = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					count++;
				}
				if (i == j) {
					count--;
				}
			}
		}
		System.out.println("동명이인수" + count / 2);

	}

}
