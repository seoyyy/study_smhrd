<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

	<script type = "text/javascript">
	function goList(){
		//bookList페이지로 이동 
		// PathVarialbe을 사용중인 페이지에서는 /ContextPath/를 붙이자.
		//   / 는 http://localhost:8083/  까지 포함 
		location.href = '/bshop/bookList.do'
	
	}

</body>
</html>