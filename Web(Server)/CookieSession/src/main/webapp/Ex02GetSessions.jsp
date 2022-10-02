<%@page import="java.util.Enumeration"%>
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

//2. 한꺼번에 세션 삭제하는
// .getAttributeNames() 세션객체내에 저장되있는 모든 네임값을 가져오겠다  (모든값을 가지고있는건아니고 네임값만 가지고있음)
 Enumeration names = session.getAttributeNames();
// Enumeration 타입 : 객체들의 집합 - 각 객체들을 하나씩 처리할 수 있는 메소드를 제공

//객체들의 개수를 확인하는 메소드
//.hasMoreElements() : names 안에 요소가 더 있으면 true, 없으면 false 변환( false가 되면 반복문종료되도록)
while(names.hasMoreElements()){
	//session객체의 키값(name)을 가져오기 - 그네임값이 object타입으로 반환됨-우리는 문자열을 원하니 toString()메소드사용해서 문자열로 바꿔줌
	String name = names.nextElement().toString();
	//키값을 통해 실제 값 가져오기
	String value = session.getAttribute(name).toString();
	
	out.print(name + " : " + value + "<br>");
	
}

%>

</body>
</html>