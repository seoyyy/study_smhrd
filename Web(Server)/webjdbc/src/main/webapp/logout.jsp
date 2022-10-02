<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	// 세션에 저장된 id삭제하기 
	session.removeAttribute("id");
	response.sendRedirect("Main.jsp");
	

%>


</body>
</html>