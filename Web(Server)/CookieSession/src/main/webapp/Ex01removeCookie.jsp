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
//쿠키삭제 (따로 메소드 존재하지 않음)
// 쿠키생성 -> 삭제할 쿠키의 키(name)와 동일한 키를 가진 쿠키를 생성
//따로 삭제하는 메서드는 따로 없고 새로 다시 만들어서 만들었던쿠키의 키값과 동일하게 적어주기
Cookie cookie = new Cookie("id","");

//2. 유효기간을 설정(0)
cookie.setMaxAge(0);

//삭제가 되더라도 클라이언트에게 보내야함
//3.쿠키를 클라이언트로 전송 (응답임)
response.addCookie(cookie);


%>
<a href="Ex01GetCookie.jsp">쿠키확인</a>


</body>
</html>