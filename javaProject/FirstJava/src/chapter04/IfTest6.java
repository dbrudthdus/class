package chapter04;

public class IfTest6 {

	public static void main(String[] args) {
		
		// 양수, 음수, 0 판별하는 프로그램
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("양수");
			if(num%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			if (num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}

	

		}

	}
