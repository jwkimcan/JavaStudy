package test;

public class TEST02C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pie p = new Pie();
		p.rid=8;
		System.out.println(p.calculateArea());
		System.out.println(p.calculateRound());
		System.out.println(p.calculateArea(25));
		
		Pro pro = new Pro();
		pro.name ="새우깡";
		pro.pay =1300;
		pro.day ="2021-03-02";
		
		System.out.println("이름"+pro.name+"\n가격 :"+pro.pay+"\n유통기한 :"+pro.day);
		System.out.println("새우깡 5개의 가격 :"+pro.mulPay(5));
		System.out.println("새우깡 5개의 가격 :"+pro.mulPay(13));
		
		pro.expirationdate();
		
		
		
	}

}
