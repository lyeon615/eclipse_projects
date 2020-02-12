<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	table{
		background-color: green;
	}
</style>
</head>
<body>
	<table border="1" >
	<c:forEach var="i" begin="1" end="9" step="1">
		<tr>
		<c:forEach var="j" begin="2" end="9" step="1">		
		<td>${j} X ${i} = ${i*j} </td>				
		</c:forEach>
		</tr>
	</c:forEach>
	</table>
	<br/>
	
	<table border="1" >
	
	<c:forEach var="i" begin="1" end="9" step="1">
		<tr>
		<c:forEach var="j" begin="2" end="9" step="1">		
		<c:if test="${(i*j)%2 == 0 }"> <td>${j} X ${i} = ${i*j} </td> </c:if>		
		<c:if test="${(i*j)%2 == 1 }"> <td> </td> </c:if>						
		</c:forEach>
		</tr>
	</c:forEach>
	</table>
</body>
</html>