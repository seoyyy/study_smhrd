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
	//쿠키를 가져올때도 자바코드로!(쿠키는 한꺼번에 가져오는 방법밖에없음)
	//1.쿠키 객체들 가져오기 (가져오면 반환타입은 쿠키타입)
	Cookie[] cookies = request.getCookies();
	
	//리스트에 들어있는 값들 꺼내주기 ㄹfor문사용
	//2.각 쿠키의 키, 값을 화면에 출력
	for(Cookie c:cookies){
	out.print(c.getName()+" : "+ c.getValue()+"<br>");	
	}
	
	%>

<a href ="Ex01removeCookie.jsp">쿠키삭제</a>

</body>
</html>