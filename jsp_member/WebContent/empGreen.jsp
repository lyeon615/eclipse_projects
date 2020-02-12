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
		/* 포트번호 1521의 로컬호스트는 오라클 주소입니다 */
		String uid = "scott";
		String upw = "tiger";
		String query = "SELECT * FROM emp where comm is not null"; 
	%>
	<%
		try{
			Class.forName(driver); //oracle.jdbc.driver.OracleDriver
			//동적 객체 생성 방법, forName() static 함수이기 때문에 new 없이 바로 사용할 수 있다.
			connection = DriverManager.getConnection(url, uid, upw); //jdbc:oracle:thin:@localhost:1521:xe , scott , tiger
			//connection 정보를 받아오면 데이터베이스랑 연결 되었다는 의미
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
		}catch(Exception e){ // 위에 사용하는 함수들이 런타임엑셉션이 아닌 Exception을 상속받기 때문에 트라이캐치문으로 처리해준다.			
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