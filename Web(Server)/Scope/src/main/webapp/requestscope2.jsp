<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=
//값을 ㄱㅏ져오고 그 값이 넘어왔는지 확인
request.getAttribute("nick")
%>
${requestScope.nick}



</body>
</html>