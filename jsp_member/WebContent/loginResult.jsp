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
	String name, id, pw;
%>
<%
	/* 세션 덕분에 아래에서 "name" "id" "pw" 등 사용 가능함 */
	name = (String)session.getAttribute("name");
	id = (String)session.getAttribute("id");	
	pw = (String)session.getAttribute("pw");		
%>

	<%= name %> 님 안녕하세요<br/>
	<a href="modify.jsp">회원 정보 수정</a>
</body>
</html>