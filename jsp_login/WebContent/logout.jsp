<%@ page import = "java.util.Enumeration" %>
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
		
	
		Enumeration enumeration = session.getAttributeNames();

		while(enumeration.hasMoreElements()){
			String sName = enumeration.nextElement().toString();
			String sValue = (String)session.getAttribute(sName);
		
			if(sValue.equals("abcde"))
				session.removeAttribute(sName);	
		}
	/* 	Cookie[] cookies = request.getCookies();
	
		if(cookies != null){
			for(int i=0; i>cookies.length; i++){
				//쿠키삭제
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]); 
			}
		}*/
		//response.sendRedirect("login.jsp")
		response.sendRedirect("cookietest.jsp");

	%>
	
</body>
</html>