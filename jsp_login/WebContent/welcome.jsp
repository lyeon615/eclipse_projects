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
		//Iterator ��������
		Enumeration enumeration = session.getAttributeNames();
		while(enumeration.hasMoreElements()){
			String sName = enumeration.nextElement().toString();
			String sValue = (String)session.getAttribute(sName);
			
			if(sValue.equals("abcde"))
				out.println(sValue+"�� �ȳ��ϼ���." + "<br/>");

		}
	
	
	/* Cookie[] cookies = request.getCookies();
	
		for(int i = 0; i<cookies.length; i++){
			String id = cookies[i].getValue();
			
			if(id.equals("abcde"))
				out.println(id+"�� �ȳ��ϼ���." + "<br/>");
			
		} */
	
	%>
	<a href="logout.jsp">�α׾ƿ�</a>
</body>
</html>