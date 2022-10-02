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
	//세션에 저장된 id가져오기 -> 출력
	String id = (String)session.getAttribute("id");
	
	if(id == null){
		out.print("<h1> 회원관리 메인 페이지 </h1>");
	}else{
		out.print("<h1>"+ id +"님 환영합니다.</hr>");
	}
%>

<a href="join.html">회원가입</a> 
<%if(id==null){ %>
<a href="login.html">회원 로그인</a>
<% }else{ %>
<a href="logout.jsp">회원로그아웃</a>
<% } %>

<a href="update.html">회원 수정</a>
<a href="#">회원 삭제</a>
<a href="#">회원 검색</a>
<a href="#">회원 전체 검색 </a>


</body>
</html>