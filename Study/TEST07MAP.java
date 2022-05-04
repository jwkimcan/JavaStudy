package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TEST07MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Goods> goods = new ArrayList<>();
		Iterator<Goods> iter = goods.iterator();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		Scanner sc6 = new Scanner(System.in);
		Scanner sc7 = new Scanner(System.in);
		Scanner sc8 = new Scanner(System.in);
		Scanner sc9 = new Scanner(System.in);
		Scanner sc10 = new Scanner(System.in);
		Scanner sc11 = new Scanner(System.in);
		Scanner sc12 = new Scanner(System.in);
		int kind = 10;
		String name = "";
		int pri = 0;
		String sta = "";
		while (kind != 5) {

			System.out.println("1 : 입력 2 : 출력 3 : 수정 4:삭제  5 : 종료");
			kind = sc.nextInt();
			if (kind == 1) {
				System.out.println("제품명을 입력해주세요");
				name = sc2.nextLine();
				System.out.println("가격을 입력해 주세요");
				pri = sc3.nextInt();
				System.out.println("제품 상태를 입력해주세요");
				sta = sc4.nextLine();
				if (sta.equals("판매중") || sta.equals("판매완료") || sta.equals("예약중")) {
					goods.add(new Goods(name, pri, sta));
				} else {
					System.out.println("제품 상태를 확인해주세요");
				}
			}
			if (kind == 2) {
				if (goods.isEmpty()) {
					System.out.println("비어있습니다");
				} else {
					for (Goods str : goods) {
						System.out.println(str);

					}
//					while (iter.hasNext()) {
//						Goods str = iter.next();
//						System.out.println(str);
//					}
				}
			}
			if (kind == 3) {
				System.out.println("어떤 상품을 수정하시겠습니까??");
				String upGood = sc5.nextLine();
				for (int i = 0; i < goods.size(); i++) {
					if (goods.get(i).getName().equals(upGood)) {
						System.out.println("상품의 가격을 변경하시겠습니까? (예 or 아니요)");
						String radio = sc6.nextLine();
						if (radio.equals("예")) {
							System.out.println("변경할 가격을 입력해주세요");
							int setPri = sc7.nextInt();
							goods.get(i).setPrice(setPri);
						}

						System.out.println("상품의 상태를 변경하시겠습니까? (예 or 아니요)");
						radio = sc8.nextLine();
						if (radio.equals("예")) {
							System.out.println("변경할 상태를 입력해주세요");
							String setSt = sc9.nextLine();
							if (sta.equals("판매중") || sta.equals("판매완료") || sta.equals("예약중")) {
								goods.get(i).setState(setSt);
							}
						}
					} else {
						System.out.println("없는 제품 입니다");
					}

				}
			}
			if (kind == 4) {
				System.out.println("어떤 제품을 제거 하시겠습니까");
				String delGood = sc10.nextLine();
				for (int i = 0; i < goods.size(); i++) {
					if (goods.get(i).getName().equals(delGood)) {
						goods.remove(i);
						break;
					} else {
						System.out.println("없는 상품입니다");
					}

				}
			}
			if (kind > 5) {
				System.out.println("숫자를 확인해주세요");
			}

		}
	}

}
