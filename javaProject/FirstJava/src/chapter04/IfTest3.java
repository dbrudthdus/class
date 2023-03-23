package chapter04;

public class IfTest3 {

	public static void main(String[] args) {
		
		
		// 점수가 90점 이상인 경우 "A"를 출력
		// 80점 이상이면서 90점 미만인 경우 "B"를 출력
		// 90점 이상도 아니고, 80점 이상도 아닌 경우 "C"를 출력
		
		
		
		int score = 98;
		
		if(score>90) {
			// System.out.println("A");
			if(score > 96) {
				System.out.println("A+");
			} else if(score > 93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		} else if (score >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		
		
		
		
		
		
		
		

	}

}
