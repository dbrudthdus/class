package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 객체를 생성 : 연결정보
			// jdbcUrl
			// Oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

			// Mysql 연결
			// String dbUrl = "jdbc:mysql://localhost:3306/project";
			// Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");

			// 3. Statement / PrepardeStatement => sql 실행 요청 메소드

			// sql
			String sql = "select * from dept where deptno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 피라미터 설정
			pstmt.setInt(1, 10);

			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행 메소드 : executeQuery(String sql)
			ResultSet rs = pstmt.executeQuery();

			// 5. ResultSet 객체에서 데이터 추출
			if (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" 
			                     + rs.getString(2) + "\t" 
						         + rs.getString(3));
			}

			rs.close();
			pstmt.close();
			conn.close();

			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}
