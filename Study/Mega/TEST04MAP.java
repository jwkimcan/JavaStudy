package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TEST04MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> myCharacter = new HashMap<>();
		myCharacter.put("닉네임", "마로비아나");
		myCharacter.put("직업", "마법사");
		myCharacter.put("서버", "B");
		myCharacter.put("레벨", "38");

		// [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
		List<Map<String, String>> characters = new ArrayList<>();
		Map<String, String> character1 = new HashMap<>();
		character1.put("닉네임", "사자고양이");
		character1.put("직업", "전사");
		character1.put("서버", "A");
		character1.put("레벨", "11");
		characters.add(character1);

		Map<String, String> character2 = new HashMap<>();
		character2.put("닉네임", "하구루");
		character2.put("직업", "마법사");
		character2.put("서버", "B");
		character2.put("레벨", "46");
		characters.add(character2);

		Map<String, String> character3 = new HashMap<>();
		character3.put("닉네임", "바다");
		character3.put("직업", "힐러");
		character3.put("서버", "B");
		character3.put("레벨", "23");
		characters.add(character3);

		Map<String, String> character4 = new HashMap<>();
		character4.put("닉네임", "초보");
		character4.put("직업", "힐러");
		character4.put("서버", "A");
		character4.put("레벨", "4");
		characters.add(character4);

		Map<String, String> character5 = new HashMap<>();
		character5.put("닉네임", "남라");
		character5.put("직업", "힐러");
		character5.put("서버", "B");
		character5.put("레벨", "84");
		characters.add(character5);

		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 직업 파티원을 찾아드릴가요?");
		String job = sc.nextLine();
		Map<String, String> Max = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			if (characters.get(i).get("직업").equals(job) && myCharacter.get("서버").equals(characters.get(i).get("서버"))) {
				System.out.println(characters.get(i));
			}

		}

	}

}
