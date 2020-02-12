<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix ="sql" uri ="http://java.sun.com/jsp/jstl/sql" %> 
<sql:setDataSource
	dataSource="jdbc/oracle"
	url="jdbc:oracle:thin:@localhost:1521:xe" 
    driver="oracle.jdbc.driver.OracleDriver"
    user="scott"
    password="tiger"
    var= "ds"
    scope="page"/>
<sql:query 
	sql="select * from emp" 
	var="rs" 
	dataSource="${jdbc/oracle}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	
	<table border ="1">
		<tr>
		<c:forEach var ="eName" items = "${rs.eName}">		
			<td><c:out value="${eNmae}"/></td>
		</c:forEach>
		</tr>
	</table>
	
</body>
</html>