<%@page import="kr.book.domain.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<div class="container">
		<h2>보유 도서 현황</h2>
				<%
					//request 영역에 저장된 list 거내오기
				List<Book> list = (List<Book>) request.getAttribute("list");
				%>
<table class="table table-bordered table-hover" border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작가</td>
		<td>출판사</td>
		<td>ISBN</td>
		<td>보유도서수</td>	
	</tr>	
	<%
		for (Book book : list) {
					%>
	<tr>
	<td><%=book.getNum()%></td>

	<td><a href ="/bshop/bookList.do/<%=book.getNum()%>"><%=book.getTitle()%></a></td> 
						
	<td><%=book.getTitle()%></td>
	<td><%=book.getAuthor()%></td>
	<td><%=book.getCompany()%></td>
	<td><%=book.getIsbn()%></td>
	<td><%=book.getCount()%></td>
	</tr>	
        <%
		}
		%>
</table>
</div>






</body>
</html>