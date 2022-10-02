<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 세션에 저장된 닉네임 출력하기(먼저생성한세션불러오기)
	로그아웃 버튼 누르면 logout.jsp로이동 -->

<% 
//변수에 담아주려면 object형태(더큰)에서 string으로 강제형변환해주기
	String nick = (String)session.getAttribute("nick");

%>

<%=nick %>님 환영합니다.
<a href ="logout.jsp">로그아웃</a>

</body>
</html>