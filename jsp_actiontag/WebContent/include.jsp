<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>include.jsp 페이지입니다.</h1>
	<jsp:include page="sub.jsp" flush = "false"/>
	<!-- flush 규정 안 되어 있으면 false가 기본 -->
	<h1>include.jsp 페이지입니다.</h1>
	
</body>
</html>