<%@ page import = "edu.bit.ex.Triangle" %>
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
	
	String str = request.getParameter("w");
	String str2 = request.getParameter("h");
	double w = Double.parseDouble(str);
	double h = Double.parseDouble(str2);
	
	Triangle t = new Triangle();
	
	%>
	
	�ﰢ���� ���̴� <%= t.getTriangleArea(w, h) %><br/>
	
	�簢���� ���̴� <%= t.getRectagleArea(w, h) %>
</body>
</html>