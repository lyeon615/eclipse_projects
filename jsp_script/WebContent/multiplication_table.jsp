<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<style>
		
	</style>
</head>
<body>
	<h1>������ ���</h1>

	<%
	out.print("<table border = \"1\" bordercolor = \"Orange\"><tr>");
	for(int i = 2; i <= 9 ; i++){
		out.print("<td>" + i + "��</td>");
	}
	out.print("</tr><br/>");
	for(int i = 1; i <= 9 ; i++){
		out.print("<tr>");
		for(int j = 2 ; j<=9 ; j++)	{
			out.print("<td>" + j + " X " + i + " = " + i*j + "</td>");	
		}
		out.print("</tr>");
	}
	out.print("</table>");
	%>	
	
	<!-- ����� ���� -->
	<h3>������ ���</h3>
	
	<table border = "1">
	<%
	for(int i = 0; i < 10 ; i++){
		out.print("<tr>");
		for(int j = 2; j <10 ; j++){
			if(i==0)
				out.println("<td>" + j + "��</td>");
			else
				out.print("<td>" + j + " X " + i + " = " + (i*j) + "</td>");	
		}
		out.print("</tr>");	
	}	
	%>
	</table>
	
</body>
</html>