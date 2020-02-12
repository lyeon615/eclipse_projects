<%@ page import ="java.util.Arrays" %>
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
	int[] iArr = {10,20,30};
	out.println(Arrays.toString(iArr));
	%>
	<!-- <h1>주석입니다</h1> -->
	<%--주석입니다.위와는 소스 태그 상의 차이가 있습니다. --%>
</body>
</html>