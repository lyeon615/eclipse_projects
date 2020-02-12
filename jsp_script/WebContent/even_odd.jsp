<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>1~10 까지 짝수 홀수 여부 출력</h1>
	<table border = "1">
		
		<%
		for(int i = 0 ; i <=10 ; i++){
			out.print("<tr><td>"+i+"</td>");
			if(i % 2 == 0)
				out.println("<td>짝수입니다.</td></tr>");
			else
				out.println("<td>홀수입니다.</td></tr>");	
		}		
		%>
		
	</table>
	
</body>
</html>