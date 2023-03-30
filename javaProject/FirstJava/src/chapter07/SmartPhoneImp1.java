package chapter07;

public class SmartPhoneImp1 extends Phone {

	String model;

	public SmartPhoneImp1(String phoneNumber, String madel) {
		super(phoneNumber);
		this.model = madel;
	}

	@Override
	void call() {
		super.call();
		System.out.println(model + "이어팟을 이용해서 통화합니다.");
	}

	public static void main(String[] args) {
		SmartPhoneImp1 phone = new SmartPhoneImp1("010-2222-5555", "google");

		phone.call();
	}

}
