package edu.bit.ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JstlDAO {

	private DataSource dataSource;

	public JstlDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<JstlDTO> jstlSelect() {
		ArrayList<JstlDTO> list = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM EMP");

			while (rs.next()) {
				String eName = rs.getString("eName");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hireDate = rs.getString("hireDate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptNo = rs.getString("deptNo");

				JstlDTO dto = new JstlDTO(eName, job, mgr, hireDate, sal, comm, deptNo);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
}
