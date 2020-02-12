<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id = "c" class = "edu.bit.ex.Circle" scope ="page"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name ="c" property="radius" param = "r"/>

	원의 넓이는 <jsp:getProperty name ="c" property="circleArea"/><br/>

</body>
</html>