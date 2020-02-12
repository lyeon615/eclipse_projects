package board03;

import java.sql.*;

public class MySqlConnectionMaker implements ConnectionMaker {
	private final String URL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "1111";

	public Connection makeConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conn;
	}
}
