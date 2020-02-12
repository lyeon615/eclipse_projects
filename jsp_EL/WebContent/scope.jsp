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
		pageContext.setAttribute("name", "hong gil dong");
		request.setAttribute("id", "abcde");
	%>
	<h2> scope 페이지 </h2>
		request: <%= request.getAttribute("id") %><br/>
		pageContext: <%= pageContext.getAttribute("name") %><br/>
		<!-- 유효범위가 같은 범위이기 때문에 출력 가능 -->
		<a href ="scope2.jsp">이동</a><br/>

	<hr/>		
	<jsp:forward page ="scope2.jsp"/>
</body>
</html>