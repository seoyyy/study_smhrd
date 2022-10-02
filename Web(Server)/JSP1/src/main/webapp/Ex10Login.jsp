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
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals("smart")&& pw.equals("123")){
	//리다이렉팅 방식으로 페이지 이동 (서버가 클라이언트한테 여기로이동해 하고 지시하는거기때문에 리스폰스에 해당 -문자열로  어디로이동하는지경로 ./img/)
	//요청 2번 발생
	//response.sendRedirect("Ex10.LoginSuccess.jsp");
	
	//요청이 1번 일어나는 방법 ( 포워딩forwarding 방식으로 페이지 이동)
	RequestDispatcher rd = request.getRequestDispatcher("Ex10LoginSuccess.jsp");
	request.setAttribute("id",id);
	rd.forward(request, response);
	
	
}else{
	response.sendRedirect("Ex10.LoginFail.jsp");
}

%>


</body>
</html>