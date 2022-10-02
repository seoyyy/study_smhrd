<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 세션에 저장된 닉네임을 삭제, loginForm.jsp 로 이동하기 -->
<% 
//지정해서 특정 세션을 하나씩 없애주는
	session.removeAttribute("nick");
//한꺼번에 없애려면 invailate();

response.sendRedirect("loginForm.jsp");


%>

</body>
</html>