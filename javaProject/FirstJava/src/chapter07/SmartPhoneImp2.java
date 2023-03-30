package chapter07;

public class SmartPhoneImp2 extends Phone {

	
	String madel;

	public SmartPhoneImp2(String phoneNumber, String madel) {
		super(phoneNumber);
		this.madel = madel;
	}

	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
	}

	public void playMusic() {
		System.out.println("음악을 듣습니다");
	}

	public static void main1(String[] args) {

		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는것
		Phone p = new SmartPhoneImp2("010-0000-0000", "IOS");
		p.call(); // 하위 타입 인스턴스에 정의되어 있는 오버라이딩 된 call() 호출된다.

		// p.playMusic();

		// SmartPhoneImp2 p2 = new SmartPhoneImp2("000", "test");
		
		SmartPhoneImp2 p2 = (SmartPhoneImp2)p;
		p2.playMusic();
	}

	public static void main(String[] args) {
		SmartPhoneImp2 phone = new SmartPhoneImp2("010-2222-5555", "google");

		phone.call();
	}

}
