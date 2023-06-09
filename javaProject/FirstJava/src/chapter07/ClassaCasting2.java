package chapter07;

public class ClassaCasting2 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-1111-1111");
		IPhone iPhone = new IPhone("010-2222-2222");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);

	}
	
	// 매개변수에 다형성을 적용 => 추가적인 메소드 생성이 필요없어진다.
	public static void callByPhone(Phone p) {
		p.call();
	}
	
	
	public static void callByPhone(AndroidPhone p) {
		p.call();	
	}
	public static void callByPhone(IPhone p) {
		p.call();	
	}

	
}
