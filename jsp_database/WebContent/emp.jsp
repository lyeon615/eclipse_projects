<%@ page import= "java.sql.DriverManager" %>
<%@ page import= "java.sql.Connection" %>
<%@ page import= "java.sql.Statement" %>
<%@ page import= "java.sql.ResultSet" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
	<%!
		Connection connection;
		Statement statement;
		ResultSet resultSet;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/* ��Ʈ��ȣ 1521�� ����ȣ��Ʈ�� ����Ŭ �ּ��Դϴ� */
		String uid = "scott";
		String upw = "tiger";
		String query = "SELECT * FROM emp"; 
	%>
	<%
		try{
			Class.forName(driver); //oracle.jdbc.driver.OracleDriver
			//���� ��ü ���� ���, forName() static �Լ��̱� ������ new ���� �ٷ� ����� �� �ִ�.
			connection = DriverManager.getConnection(url, uid, upw); //jdbc:oracle:thin:@localhost:1521:xe , scott , tiger
			//connection ������ �޾ƿ��� �����ͺ��̽��� ���� �Ǿ��ٴ� �ǹ�
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query); // SELECT * FROM emp
			
			out.print("<table border = \"1\"");
			while(resultSet.next()){
				String empno = resultSet.getString("empno");
				String ename = resultSet.getString("ename");
				String job = resultSet.getString("job");
				String mgr = resultSet.getString("mgr");
				String hiredate = resultSet.getString("hiredate");
				String comm = resultSet.getString("comm");
				String deptno = resultSet.getString("deptno");

				out.println("<tr>");
				out.println("<td>" + empno + "</td>");
				out.println("<td>" + ename + "</td>");
				out.println("<td>" + job + "</td>");
				out.println("<td>" + mgr + "</td>");
				out.println("<td>" + hiredate + "</td>");
				out.println("<td>" + comm + "</td>");
				out.println("<td>" + deptno + "</td>");
				out.println("</tr>");

			}
			out.print("</table border = \"1\"");
		}catch(Exception e){ // ���� ����ϴ� �Լ����� ��Ÿ�ӿ������� �ƴ� Exception�� ��ӹޱ� ������ Ʈ����ĳġ������ ó�����ش�.			
		}finally{
			try{
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			}catch(Exception e){}
		}
		
	%>
	
	
	</body>
</html>