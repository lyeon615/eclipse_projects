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

	<h2>작성하신 내용은 아래와 같습니다</h2>
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
	
	이름 : <%=name %><br/>
	<hr/>
	성별 : <%=sex %><br/>
	<hr/>
	아이디 : <%=id %><br/>
	<hr/>
	주소 : <%=address %><br/>
	<hr/>
	전화번호 : <%=tel %><br/>
	<hr/>
	이메일주소 : <%=email %><br/>
	<hr/>
	취미 : <br/>
	<% 
		if(hobby == null)
			out.println("[선택한 취미가 없습니다]");
		else{
			out.println("<table border = \"1\" ");
			for(int i = 0 ; i < hobby.length; i++)
				out.println("<tr><td align=center>"+hobby[i]+"</td></tr>");
			out.println("</table>");
		}
	%>		
	
</body>
</html>