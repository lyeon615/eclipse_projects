package edu.bit.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//Data Access Object
public class MemberDAO2 {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";

	public MemberDAO2() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MemberDTO2> memberSelect() {
		ArrayList<MemberDTO2> dtos = new ArrayList<MemberDTO2>();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();

			resultSet = statement.executeQuery("select eName, hireDate from emp where comm is not null");

			while (resultSet.next()) {
				String eName = resultSet.getString("eName");
				String job = resultSet.getString("job");
				String mgr = resultSet.getString("mgr");
				String hireDate = resultSet.getString("hireDate");
				String sal = resultSet.getString("sal");
				String comm = resultSet.getString("comm");
				String deptNo = resultSet.getString("deptNo");

				MemberDTO2 dto = new MemberDTO2(eName, job, mgr, hireDate, sal, comm, deptNo);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;

	}

}
