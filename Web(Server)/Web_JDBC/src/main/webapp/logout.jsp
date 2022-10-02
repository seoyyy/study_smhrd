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
	//세션에 저장된 id삭제하기
	session.removeAttribute("id");
	//그리고 다시 메인으로 이동
	response.sendRedirect("Main.jsp");


%>

</body>
</html>