package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;

		while (num < 10) {

//			System.out.println("2 x " + num + " = " + num*2);

//			System.out.print("2 x " + num + " = " + num*2);
//			System.out.print("\t 3 x " + num + " = " + num*3);
//			System.out.print("\t 4 x " + num + " = " + num*4);
//			System.out.print("\t 9 x " + num + " = " + num*9);
			num++;

			System.out.println();

			int n = 2;

			while (n < 10) {
				System.out.print(n + "x" + num + "=" + n * num + "\t");
				n++;

			}
		}

	}

}
