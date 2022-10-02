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
//세션에 저장된 id 가져오기 -> 출력
String id = (String)session.getAttribute("id"); //세션에 담긴 id라고 저장해논거 가져오기, 그리고 출력하기위해 변수에 담아주고 String으로 형변환시켜주기

//메인jsp에서 세션을 가져올건데 세션에 값이 없으면(로그인을 안한 상태라면) 회원관리 메인페이지가 나올거고, 로그인 한 상태라면 ~님 환영합니다 출력
if(id == null){  //세션에 값(저장된 id가)이 없다면
	out.print("<h1>회원관리 메인페이지</h1>");
}else{		//세션에 값이 있어서 로그인을 한상태라면
	out.print("<h1>"+ id +"님 환영합니다.</h1>");
}



%>




<!-- 각기능들로 갈수있는 a태그 만들어주기-->

<a href="join.html">회원가입</a>

<!-- 로그인이 된상태면 로그아웃버튼이생기게해주고 로그인이안된상태라면 로그인을할수있도록만들기 -->
<% if(id==null){ %>			<!-- if구문 실행문부분에 태그 넣어주기위해 스크립트릿 분리해서 넣어주기 -->
<a href="login.html">회원로그인</a>			
<%}else{ %>
<a href ="logout.jsp">회원로그아웃</a>
<%} %>

<a href="update.html">회원수정</a>
<a href="#">회원삭제</a>
<a href="#">회원검색</a>
<a href="#">회원전체검색</a>


</body>
</html>