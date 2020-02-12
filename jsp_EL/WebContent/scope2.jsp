<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h2> scope2 페이지 </h2>
		request: <%= request.getAttribute("id") %><br/>
		pageContext: <%= pageContext.getAttribute("name") %>
</body>
</html>