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
			
			while(resultSet.next()){
				String name = resultSet.getString("ename");
				String job = resultSet.getString("job");
				String mgr = resultSet.getString("mgr");
				
				out.println("�̸� : "+ name + ", ��å : " + job + ", �Ŵ��� : " + mgr + "<br/>");
			}
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