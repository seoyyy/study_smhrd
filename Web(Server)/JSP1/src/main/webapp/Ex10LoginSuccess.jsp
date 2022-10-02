<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% // String id =request.getParameter("id"); 
	// getParameter() 반환타입: String
	// getAttribute() 반환타입 : Object  - 강제 형변환 필요(캐스팅)
	String id = (String)request.getAttribute("id");

%>
<!-- 사용자가 입력한 값을 쓰고싶어면 받아오면됨 -->
<h1> <%= id %>님 환영합니다!</h1>
<a href="Ex10Login.html">로그아웃</a> <!-- a태그를 활용한건 서버에 요청한건아님!  서버페이지가아니라 그냥 주소창을 .html로바꾼거뿐! -->


</body>
</html>