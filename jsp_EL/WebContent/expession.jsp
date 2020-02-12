<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${10} <br/>
	${99.99} <br/>
	${"ABC"}<br/>
	${'ABC'}<br/> <!-- 문자표현 쌍따옴표" 따옴표' 둘 다 허용 , 아무것도 없으면 출력 x-->
	${ABC}<br/>
	${true}<br/> 
	
	${1+2}<br/> 
	${1-2}<br/> 
	${1*2}<br/> 
	${1/2}<br/>
	
	${1>2}<br/>
	${1<2}<br/>
	${1>2 ? 1 : 2}<br/>
	
</body>
</html>