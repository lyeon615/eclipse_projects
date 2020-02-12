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
	
	아이디 : <%= id %><br/>
	비밀번호 : <%= pw %><br/>
	
	<hr/><!-- 위는 옛날 버전 -->

	아이디 : ${param.id}<br/>
	비밀번호 : ${param.pw}<br/>
	
	아이디 : ${param["id"]}<br/>
	비밀번호 : ${param["pw"]}<br/><!-- 위와 표현만 다르고 같은 방법 -->
	
	<hr/>
		
	applicationScope : ${applicationScope.application_name }<br/>
	sessionScope : ${sessionScope.session_name }<br/>
	pageScope : ${pageScopeScope.page_name }<br/>
	requestScope : ${requestScope.request_name }<br/>
	
	<hr/>
	
	context 초기화 파라미터 <br/>
	
	con_name : ${initParam.con_name }<br/>
	con_id : ${initParam.con_id }<br/>
	con_pw : ${initParam.con_pw }<br/>
	
</body>
</html>