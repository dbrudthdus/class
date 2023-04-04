package chapter10;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("Example");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다.");
		}

		int[] numbers = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용가능한 index 범위를 벗어났습니다.");
			e.printStackTrace();
		}

	}

}
