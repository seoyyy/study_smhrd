<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 입력받아온 키값(이름)을 화면에 나타내줄 jsp -->


<!-- reqest.getParameter를 자바코드로 적어줘야하니 얘는 어차피 서블릿파일이 될거야-->
<%
String name = request.getParameter("name");
%>

<%= name %> 님 환영합니다.

</body>
</html>