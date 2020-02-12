<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	div{
	font-weight : bold;
	}
</style>
</head>
<body>
	<%@ page import = "java.util.Date" %>
	<%@ page import = "java.text.SimpleDateFormat" %>
	<h1>날짜/시간 출력</h1>
	
	<div>현재 날짜 : 
	<%
		Date todayTime = new Date();
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd");
		out.println(day.format(todayTime));
	%>
	</div><br/>
	
	<div>현재 시간 : 
	<%
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		out.println(time.format(todayTime));
	%>
	</div>
</body>
</html>