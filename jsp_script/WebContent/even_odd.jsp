<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>1~10 ���� ¦�� Ȧ�� ���� ���</h1>
	<table border = "1">
		
		<%
		for(int i = 0 ; i <=10 ; i++){
			out.print("<tr><td>"+i+"</td>");
			if(i % 2 == 0)
				out.println("<td>¦���Դϴ�.</td></tr>");
			else
				out.println("<td>Ȧ���Դϴ�.</td></tr>");	
		}		
		%>
		
	</table>
	
</body>
</html>