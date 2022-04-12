package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("합은 :%d \n", sum);
		System.out.println("===============");
		 sum=0;
		for(int i = 1 ; i<= 5 ; i++) {
			System.out.printf("%d 번쨰 수를 입력해주세요",i);
			num=sc.nextInt();
			sum+=num;
		}
		System.out.printf("총합 : %d 평균 : %.2f \n",sum,sum/5.);
		System.out.println("===============");
		System.out.println("수를 입력하세요");
		num=sc.nextInt();
		sum=1;
		for(int i = 1;i<=num;i++) {
			sum*=i;
		}
		System.out.printf("%d! = %d\n",num,sum);
		System.out.println("===============");
		int[] numa = new int[5];

		for (int a = 0; a < numa.length; a++) {
			System.out.printf("%d번쨰수를 입력하세요", a + 1);

			numa[a] = sc.nextInt();
			if (numa[a] > 1000) {
				System.out.println("수가 1000은 넘을순 없습니다");
				a--;
			}
		}

		int min = numa[0];
		for (int a = 1; a < numa.length; a++) {
			if (min > numa[a])
				min = numa[a];
		}
		System.out.println("가장 작은수 : " + min);
		System.out.println("===============");
		System.out.println("수를 입력하세요");
		num=sc.nextInt();
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
