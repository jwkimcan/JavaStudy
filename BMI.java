package st.com;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg = 0.0;
		double high = 0;
		double bmi = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("체중을 입력하여 주시기 바랍니다.");
		kg = s1.nextDouble();
		System.out.println("키를 입력하여 주시기 바랍니다.");
		high = s1.nextDouble();
		bmi = kg / (high * high);
		if (bmi >= 35) {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 고도비만입니다.", bmi);
		} else if (bmi >= 30) {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 2차비만입니다.", bmi);
		} else if (bmi >= 25) {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 1차비만입니다.", bmi);
		} else if (bmi >= 23) {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 과체중입니다.", bmi);
		} else if (bmi >= 18.25) {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 정상 입니다.", bmi);
		} else {
			System.out.printf("당신의 쳬질량 지수는 %.2f 이며 저체중입니다.", bmi);
		}
	}
}
