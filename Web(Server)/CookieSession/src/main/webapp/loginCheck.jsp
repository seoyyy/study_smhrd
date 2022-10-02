<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- loginForm.jsp에서 아이디와 비밀번호를 받아오기
	받아온 값이 test와 12345이면 세션생성후 세션에 닉네임 저장, main.jsp로 이동, 
	값이 다르면 loginForm.jsp로 다시 이동 -->
<% //post방식의 데이터 전송 -->한글인코딩해주기 
request.setCharacterEncoding("UTF-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals("test") && pw.equals("12345")){
	
	session.setAttribute("nick","쿠키몬스터");
	response.sendRedirect("main.jsp");
	//이 세션을 메인으로 보내줄거야
	
	
}else{
	response.sendRedirect("loginForm.jsp");
}

%>



</body>
</html>