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
		String query = "SELECT * FROM emp where comm is not null"; 
	%>
	<%
		try{
			Class.forName(driver); //oracle.jdbc.driver.OracleDriver
			//���� ��ü ���� ���, forName() static �Լ��̱� ������ new ���� �ٷ� ����� �� �ִ�.
			connection = DriverManager.getConnection(url, uid, upw); //jdbc:oracle:thin:@localhost:1521:xe , scott , tiger
			//connection ������ �޾ƿ��� �����ͺ��̽��� ���� �Ǿ��ٴ� �ǹ�
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query); // SELECT * FROM emp
			
			out.print("<table border = \"1\" bordercolor = \"green\"");
			while(resultSet.next()){
				String eName = resultSet.getString("ename");
				String hireDate = resultSet.getString("hiredate");
				String comm = resultSet.getString("comm");


				out.println("<tr>");
				out.println("<td>" + eName + "</td>");
				out.println("<td>" + hireDate + "</td>");
				out.println("<td>" + comm + "</td>");

				out.println("</tr>");

			}
			out.print("</table border");
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