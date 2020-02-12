<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	int age;
	
	String str = request.getParameter("age");
	//input으로 인터넷상에서 넘어오는 데이터는 무조건 String으로 받는다.
	age = Integer.parseInt(str);
	
	if(age>=20)
		response.sendRedirect("pass.jsp?age=" + age);
	else
		response.sendRedirect("ng.jsp?age=" + age);
	%>
</body>
</html>