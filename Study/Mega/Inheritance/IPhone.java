package test;

public class IPhone extends IPodTouch {
	private String number;

	public IPhone() {
		super();
		super.setModel("IPhone");
		this.number = "010-1234-5678";
	}

	public void call(String num) {
		System.out.println(num + "로 통화중.....");
	}

	public void message(String num, String text) {
		System.out.println(num + "로" + text + " 메세지 전송");
	}

	public void number() {
		System.out.println("전화번호 :" + this.number);

	}

}
