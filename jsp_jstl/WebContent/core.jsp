<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<!-- prefix : ���̺귯���� � ������ ������� ���� ���ϱ�-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--c:set�� �������� : var vatName = varValue �� ����. --> 
	<c:set var="vatName" value ="varValue"/>
		vatName : <c:out value = "${vatName}"/><br/>
		
	<c:set var="num" value ="100"/>
		num : <c:out value = "${num}"/><br/>	
		
	<hr/>
	
	<c:remove var="num"/>
		vatName : <c:out value = "${vatName}"/><br/>
		num : <c:out value = "${num}"/><br/>	
	
	<hr/>
	���� ���� ���
	<c:catch var ="error">
		<%= 2/0 %>
	</c:catch><br/>
	<c:out value= "${error}"/>
	
	<hr/>
	<!-- if�� , else�� ���� -->
	<c:if test="${1+2==3}">
		1+2=3
	</c:if>
	
	<c:if test="${1+2!=3}">
		1+2!=3
	</c:if>
	
	<hr/>
	<!-- for�� -->
	<c:forEach var="feach" begin="0" end ="30" step ="2">
		${feach}
	</c:forEach>
	 
	<hr/>
	<!-- switch�� -->
	<c:choose>
		<c:when test="${1>2}">
			1�� 2���� ũ��
		</c:when>
		<c:when test="${2>0}">
			2�� 0���� ũ��	
		</c:when>
		<c:otherwise>
			������ üũ
		</c:otherwise>
	
	</c:choose>
		
			
	
</body>
</html>