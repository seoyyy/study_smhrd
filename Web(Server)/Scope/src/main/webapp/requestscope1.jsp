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
		// request영역에 값을 하나 설정 -> 내장객체라 그냥 사용가능
		request.setAttribute("nick","쿠키몬스터" );  //-> 키값, 실제넣을값(실제넣을값은 object타입임)
	
		//request영역안에 있는 값 가지고오기
		String nick = (String)request.getAttribute("nick");
		
		//forwaridng 방식사용 해서 이동하는ㄴ
		RequestDispatcher rd =  request.getRequestDispatcher("requestScope2.jsp");
		rd.forward(request,response);
	%>

<%=nick%>
${nick}  <!-- 영역안에 있는 키값을 적어주는것! 변수명적어주는게 아님 -->

	<a href="requestscope2.jsp">2로 이동</a>

</body>
</html>