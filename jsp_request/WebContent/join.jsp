<%@ page import = "java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	table{
		width :200px
	}

</style>
</head>
<body>

	<h2>�ۼ��Ͻ� ������ �Ʒ��� �����ϴ�</h2>
	<% 

	request.setCharacterEncoding("UTF-8");
	
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String pw2 = request.getParameter("pw2");
	String address = request.getParameter("address");
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");

	String[] hobby = request.getParameterValues("hobby");

	
	%>
	
	�̸� : <%=name %><br/>
	<hr/>
	���� : <%=sex %><br/>
	<hr/>
	���̵� : <%=id %><br/>
	<hr/>
	�ּ� : <%=address %><br/>
	<hr/>
	��ȭ��ȣ : <%=tel %><br/>
	<hr/>
	�̸����ּ� : <%=email %><br/>
	<hr/>
	��� : <br/>
	<% 
		if(hobby == null)
			out.println("[������ ��̰� �����ϴ�]");
		else{
			out.println("<table border = \"1\" ");
			for(int i = 0 ; i < hobby.length; i++)
				out.println("<tr><td align=center>"+hobby[i]+"</td></tr>");
			out.println("</table>");
		}
	%>		
	
</body>
</html>