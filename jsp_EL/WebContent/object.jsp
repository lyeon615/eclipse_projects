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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");	
	%>
	
	���̵� : <%= id %><br/>
	��й�ȣ : <%= pw %><br/>
	
	<hr/><!-- ���� ���� ���� -->

	���̵� : ${param.id}<br/>
	��й�ȣ : ${param.pw}<br/>
	
	���̵� : ${param["id"]}<br/>
	��й�ȣ : ${param["pw"]}<br/><!-- ���� ǥ���� �ٸ��� ���� ��� -->
	
	<hr/>
		
	applicationScope : ${applicationScope.application_name }<br/>
	sessionScope : ${sessionScope.session_name }<br/>
	pageScope : ${pageScopeScope.page_name }<br/>
	requestScope : ${requestScope.request_name }<br/>
	
	<hr/>
	
	context �ʱ�ȭ �Ķ���� <br/>
	
	con_name : ${initParam.con_name }<br/>
	con_id : ${initParam.con_id }<br/>
	con_pw : ${initParam.con_pw }<br/>
	
</body>
</html>