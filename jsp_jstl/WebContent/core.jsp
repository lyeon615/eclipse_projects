<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<!-- prefix : 라이브러리를 어떤 접워로 사용할지 먼저 정하기-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--c:set은 변수선언 : var vatName = varValue 와 같다. --> 
	<c:set var="vatName" value ="varValue"/>
		vatName : <c:out value = "${vatName}"/><br/>
		
	<c:set var="num" value ="100"/>
		num : <c:out value = "${num}"/><br/>	
		
	<hr/>
	
	<c:remove var="num"/>
		vatName : <c:out value = "${vatName}"/><br/>
		num : <c:out value = "${num}"/><br/>	
	
	<hr/>
	에러 문구 출력
	<c:catch var ="error">
		<%= 2/0 %>
	</c:catch><br/>
	<c:out value= "${error}"/>
	
	<hr/>
	<!-- if문 , else문 없음 -->
	<c:if test="${1+2==3}">
		1+2=3
	</c:if>
	
	<c:if test="${1+2!=3}">
		1+2!=3
	</c:if>
	
	<hr/>
	<!-- for문 -->
	<c:forEach var="feach" begin="0" end ="30" step ="2">
		${feach}
	</c:forEach>
	 
	<hr/>
	<!-- switch문 -->
	<c:choose>
		<c:when test="${1>2}">
			1은 2보다 크다
		</c:when>
		<c:when test="${2>0}">
			2는 0보다 크다	
		</c:when>
		<c:otherwise>
			마지막 체크
		</c:otherwise>
	
	</c:choose>
		
			
	
</body>
</html>