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
//page영역에 값을 설정 (nick이라는 값을 넣어놈)
	pageContext.setAttribute("nick", "쿠키몬스터");	//오브젝트 타입으로 만들어짐 쌤 해결했습니다 !!
//페이지 영역안에 있는 값 가져오기 - pageContext영역에서 값을 가져오겠다
	String nick = (String)pageContext.getAttribute("nick");	//nick이라는스트링 변수에 넣으려면 오브젝트 타입을 스트링으로 강제형변환
//가져와서 화면에 출력하고 싶어요 = 가지고온거 변수에 담아서 활용

//forwarding 방식 사용시도! - 포워딩방식으로 이동하는
RequestDispatcher rd = request.getRequestDispatcher("pagescope2.jsp");
	rd.forward(request,response);

%>

<!-- el표기법으로 화면에 출력해보기 pageScope범위내에서 nick가져오기 -->

${pageScope.nick}
<%=nick %>
<a href = "pageScope2.jsp">2로 이동</a>

</body>
</html>