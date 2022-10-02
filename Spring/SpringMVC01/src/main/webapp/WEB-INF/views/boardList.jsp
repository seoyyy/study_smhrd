<%@page import="com.smhrd.domain.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>SpringMVC01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Panel Heading</div>
			<div class="panel-body">

				<%-- 저장해놓은 list를 가져와서 출력해 사용하기  --%>

				<%
					//request 영역에 저장된 list 거내오기
				List<Board> list = (List<Board>) request.getAttribute("list");
				//만들어놨던 list 타입과 맞춰주기위해 다운캐스팅 해주기
				%>
				<table class="table table-bordered table-hover" border="1">
					<tr>
						<td>글번호</td>
						<td>제목</td>
						<td>작성자</td>
						<td>날짜</td>
						<td>조회수</td>
					</tr>


					<!-- board라는 list안에 정보를한개씩 한뭉텅이로 묶어놨음 view의 입장에서는 그 list한개가 한 행이됨. 그럼 반복문을 통해서 그 행을 하나씩 꺼내오기  -->
					<!-- jstl(Eㅣ표기법은 안불러와도 바로 쓸수 잇는데 이걸 안사용하면 request영역에 저장된 list 꺼내오기 먼저해야함)	 -->
					<%
						for (Board board : list) {
					%>
					<tr>
						<td><%=board.getIdx()%></td>
					<%-- 
					
					// 1. 쿼리스트링 - 검색처럼 특정 여러개의 조건을 걸어서 여러개의값을 뽑아낼때 많이사용
				    url?key(name이라고보기)=value&...
				    a href ="boardContent.do?idx=<%=board.getIdx()%>
					
					//2. path Variable - 특정 하나의 값을 뽑아낼때 많이 사용
					url / value1/ value2
					path variable을 쓸때는 경로 앞에 /ContexpPath/ 를 붙여줄것
					
					--%>	
						<td><a href ="/web/boardContent.do/<%=board.getIdx()%>"><%=board.getTitle()%></a></td> <!-- jsp로는 직접가면안되고 요청을할수있는 컨트롤러로 가야함 -->
						<!-- idx를 같이가져가려면 방법 1. 쿼리스트링(주소url에 데이터를 담아보내는) 2. --> 
						<td><%=board.getWriter()%></td>
						<td><%=board.getIndate()%></td>
						<td><%=board.getCount()%></td>
					</tr>


					<%
						}
					%>
					<%--     <c:forEach var="board" items="${list}">
    </c:forEach> --%>


				</table>

				<button onclick="window.location.href='boardInsert.do' " class="btn btn-sm btn-success">작성</button>

			</div>
			<div class="panel-footer">빅데이터 11차 한서영</div>
		</div>
	</div>

</body>
</html>
