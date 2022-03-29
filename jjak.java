package st.com;

import java.util.Scanner;

public class jjak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc1.nextInt();
		int hol = 0;
		int jjak = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				jjak = jjak + i;
			} else {
				hol = hol + i;
			}
			
		}
		System.out.printf("입력한 수중 홀수의 합을 %d 입니다 \n", hol);
		System.out.printf("입력한 수중 짝수의 합을 %d 입니다", jjak);
	}

}
