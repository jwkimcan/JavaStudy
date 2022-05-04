package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TEST05MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruit = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int kind = 10;
		String fru = "";
		Iterator<String> it = fruit.iterator();
		while (kind != 4) {
			System.out.println("1:입력 2: 출력 3: 삭제 4: 종료");
			kind = sc.nextInt();
			if (kind == 1) {
				System.out.println("어떤 과일을 추가할까요");
				sc.nextLine();
				fru = sc.nextLine();
				fruit.add(fru);

			}
			if (kind == 2) {
				System.out.println(fruit);

			}
			if (kind == 3) {
				System.out.println("어떤 과일을 삭제할까요?");
				String removeFru = sc2.nextLine();
				for (int i = fruit.size() - 1; i >= 0; i--) {
					String item = fruit.get(i);
					if (item.equals(removeFru)) {
						fruit.remove(removeFru);

					}
				}
			}
//			
		}
		System.out.println("시스템을 종료합니다~ ");
	}
}
