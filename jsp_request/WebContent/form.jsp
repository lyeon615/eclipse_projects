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
	
	이름 : <%=name %><br/>
	아이디 : <%=id %><br/>
	비밀번호 : <%=pw %><br/>
	취미 : <%=Arrays.toString(hobby) %><br/>
	전공 : <%=major %><br/>
	프로토콜 : <%=protocol %><br/>
	
</body>
</html>