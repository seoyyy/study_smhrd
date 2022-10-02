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
//application 영역에 값 설정
application.setAttribute("nick", "쿠키몬스터");

//application 영역에 값 가지고오기 ( 아래서 좀 활용할꺼니 변수에 담아주기 )
String nick = (String)application.getAttribute("nick");


%>
<%=nick %>
${applicationScope.nick}

<a href ="applicationscope2.jsp">2로이동</a>
</body>
</html>