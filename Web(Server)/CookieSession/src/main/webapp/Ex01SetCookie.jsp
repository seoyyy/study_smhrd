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
//쿠키나세션만드는건 자바코드로해줘야함

	//1. 쿠키 객체 생성
	// Cookie(키(String), 실제값(String))
	Cookie cookie = new Cookie("test","firstcookie"); 
	//쿠키가 가져야할 정보들설정(키(name)랑 값(value))
	//아래서 사용할꺼닌까 레퍼런스 변수 저장

	//2.유효기간 설정 .setMaxAge(초단위)
	cookie.setMaxAge(60*60*24*365); //1년
	
	//3.클라이언트에게 쿠키전송
	//서버에서 생성한 쿠키를 클라이언트에게 보내고싶어 - 응답하는거닌까 리스폰스
	response.addCookie(cookie);
	
	//4.쿠키를 생성하여 바로 클라이언트에 전송(유효기간 설정 X)
	response.addCookie(new Cookie("id","smhrd"));

%>

<a href = "Ex01GetCookie.jsp">쿠키확인</a>

</body>
</html>