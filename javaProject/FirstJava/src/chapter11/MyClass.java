package chapter11;

public class MyClass<T> {
	
	// 변수, 메소드의 반환타입, 매개변수의 타입
	T val;
	
	
	public MyClass() {
		super();
		this.val = val;
	}

	T getVal() {
		return val;
	}

	void setVal(T val) {
		this.val = val;

	}

	public static void main(String[] args) {

		MyClass<String> myClass = new MyClass<String>();
		// myClass.setVal(new Date()); // 잘못된 타입이 저장되지 않도록 처리가 된다.
		myClass.setVal("KING"); // String 타입의 데이터만 전달 가능
		System.out.println(myClass.getVal()); // String 타입의 데이터만 반환
	}

}
