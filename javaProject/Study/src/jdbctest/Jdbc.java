package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력합니다.");
		String name = sc.nextLine();
		System.out.println("지역을 입력합니다.");
		String loc = sc.nextLine();
		System.out.println("숫자를 입력합니다.");
		String str = sc.nextLine();

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.69:1521:xe", "hr", "tiger");

		PreparedStatement pstmt = conn.prepareStatement("update dept set dname=?, loc=? where deptno=?");
		pstmt.setString(1, name);
		pstmt.setString(2, loc);
		pstmt.setInt(3, Integer.valueOf(str));

		int rs = pstmt.executeUpdate();

		System.out.println(rs);

	}

	public static int numtest() {
		int num1 = 5;
		int num2 = 3;
		int sum = num1 + num2;
		return sum;
	}
}
