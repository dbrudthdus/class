package chapter08.phone;

public class Main {

	public static void main(String[] args) {
		
		// System.out.println(Phone.PHONE_NUM_3);
		
		Phone phone = null; // = new 구현한클래스();
		// 1. 전원을 키고
		phone.turnOn();
		// 2. 통화
		phone.Call();
		// 3. 전원을 끈다
		phone.turnOff();
		
		
		
		SmartPhone2 phone2 = new SmartPhone2();
		/////////////////
		// 1. 전원을 키고
		phone2.turnOn();
		// 2. 전화를 걸고
		phone2.Call();
		// 3. 게임을 한다
		phone2.gamePlay();
		// 4. 전원을 끈다 
		phone2.turnOff();
		
		

	}

}
