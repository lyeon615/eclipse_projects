<%@ page import = "java.util.Arrays" %>
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

	request.setCharacterEncoding("EUC-KR");
	
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String[] hobby = request.getParameterValues("hobby");

	String major = request.getParameter("major");
	String protocol = request.getParameter("protocol");
	
	%>
	
	�̸� : <%=name %><br/>
	���̵� : <%=id %><br/>
	��й�ȣ : <%=pw %><br/>
	��� : <%=Arrays.toString(hobby) %><br/>
	���� : <%=major %><br/>
	�������� : <%=protocol %><br/>
	
</body>
</html>