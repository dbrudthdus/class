package chapter07;

public class SmartPhone extends Phone {
	
	// 하위클래스 : 좁은의미, 기능의 확장
	
	String model;
	
	// 생략 가능
	public SmartPhone() {
		super();
	}             

	void game() {
		System.out.println(model + "게임을 합니다.");
	}

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();

		sp.phoneNumber = "010-1111-2222"; // 조상클래스로부터 상속 받은 변수
		sp.call(); // 조상클래스로부터 상속 받은 메소드

		sp.model = "Google"; // 자식클래스에서 추가로 정의한 변수
		sp.game(); // 자식클래스에서 추가로 정의한 메소드

	}

}
