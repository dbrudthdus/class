package chapter08;

public class SmartPhone extends Phone {

	private static String phoneNumber;
	String model;

	public SmartPhone() {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void turnOn() {
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");
	}

	public static void main(String[] args) {

		// Phone phone = new Phone();

		Phone smarPhone = new SmartPhone();
		smarPhone.turnOn();
	}

}
