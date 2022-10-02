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
	//1.세션생성 (이것도객체생성해야하는데 jsp에서 세션은 내장객체로 존재함- jsp페이지 안에서 선언을하지 않고도 사용가능)
		//1. 세션 값 설정
		// setAttribute(String, Object-모든객체들의최상위타입 정수형,문자열 넣어도 오브젝트형태로들어감)- 강제형변환(업캐스팅)
		session.setAttribute("id","test");
		session.setAttribute("age", 20);
		


%>

<a href="Ex02GetSession.jsp">세션확인</a>
<a href="Ex02GetSessions.jsp">세션모두확인</a>

</body>
</html>