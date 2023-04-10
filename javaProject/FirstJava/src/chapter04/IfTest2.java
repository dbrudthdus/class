package chapter04;

public class IfTest2 {

	public static void main(String[] args) {

		// 점수가 60점 이상인 경우에는
		// "PASS"를 출력 하고,
		// 60점 미만인 경우
		// "FAIL"을 출력하는 프로그램 만들기

		int score = 50;

		if (score >= 60) {
			// 60점 이상일 때
			System.out.println("PASS");
		} else {
			// 60점 이상이 아닐 때 즉, 60점 미만일 때
			System.out.println("FAIL");
		}

		int age = 20;

		if (age > 19) {
			System.out.println("투표가 가능합니다.");
		} else {
			System.out.println("아직 투표권이 없습니다.");
		}

		// 짝수/홀수 판단하는 프로그램

		int num = 5;

		if (num % 2 == 1) {
			// 나머지가 1
			System.out.println("홀수");
		} else {
			// 나머지가 0
			System.out.println("짝수");
		}

	}

}
