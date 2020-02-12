import java.sql.*;
//가장 기본적인 자바와 mysql 연결하는 프로그램

public class Ex01 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", 
			"root", "1111");
			
			System.out.println("로그인 성공");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("마무리 작업");
			if(conn != null && !conn.isClosed())
				conn.close();
		}
	}
}
