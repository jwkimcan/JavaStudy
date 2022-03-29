package st.com;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지의 합을 구할까요?");
		int num1 = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num1;i++) {
		sum=sum+i;
		}
		System.out.println(sum);
	}

	
}
