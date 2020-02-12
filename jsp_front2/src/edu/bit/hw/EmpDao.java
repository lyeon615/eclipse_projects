package edu.bit.hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmpDao {

	private static EmpDao instance = new EmpDao();
	
	private EmpDao() {
		
	}
	
	public static EmpDao getInstance() {
		return instance;
	}

	public ArrayList<EmpDto> membersAll() {
		ArrayList<EmpDto> dtos = new ArrayList<EmpDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDto dto = new EmpDto();
				
				dto.seteName(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getString("mgr"));
				dto.setHireDate(rs.getString("hireDate"));
				dto.setSal(rs.getString("sal"));
				dto.setComm(rs.getString("comm"));
				dto.setDeptNo(rs.getString("deptNo"));

				dtos.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}

	private Connection getConnection() {
		Context context = null;
		DataSource dataSource = null;
		Connection conn = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = dataSource.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
