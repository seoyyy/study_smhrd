<%@page import="com.smhrd.domain.Comm"%>
<%@page import="java.util.List"%>
<%@page import="com.smhrd.domain.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//boardNum가지고 오는 작업 필요!
	BoardDAO dao = new BoardDAO();
	int like = dao.getLike(1);
	pageContext.setAttribute("like", like);
	
	List<Comm> commList = (List<Comm>)dao.selectAllComm(1);
	pageContext.setAttribute("list", commList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
	<button id='like'>좋아요</button><span>${like }</span>
    <br>
    <input type="text"><button class='writeCom'>댓글작성</button>
    <br>
    <div id="com">
    	<c:forEach var="comm" items="${list }">
    		<p><c:out value="${comm.com }"/><button class='removeCom' id='${comm.commentNum }'>삭제</button></p>
		</c:forEach>
    </div>  
    
    <script>
        $(document).on("click","#like",function(){ 
			$.ajax({
				data : {status : "like", boardNum : 1},
				url : "LikeAjaxCon",
				method : "GET",
				dataType : "text",
				context : this,
				success: function(data){
					$('#like+span').text(data)
					$(this).text('좋아요 취소')
		            $(this).attr('id','dislike')	
				},
				error: function(){
					alert("통신실패!")
				}
			})
        });

        $(document).on("click","#dislike",function(){ 
            $.ajax({
				data : {status : "dislike", boardNum : 1},
				url : "LikeAjaxCon",
				method : "GET",
				dataType : "text",
				context : this,
				success: function(data){
						$('#dislike+span').text(data)
			            $(this).text('좋아요')
			            $(this).attr('id','like')
				},
				error: function(){
					alert("통신실패!")
				}
			})
    
        });
        $('.writeCom').click(function(){
            var com = $('input[type=text]').val()
            
            $.ajax({
				data : {boardNum : 1, com : com},
				url : "AddCommentCon",
				method : "POST",
				success: function(data){
					$('#com').prepend('<p>'+com+'<button class="removeCom" id='+data+'>삭제</button></p>')
		            $('input[type=text]').val("")
				},
				error: function(){
					alert("통신실패!")
				}
			})    
        })

        $('#com').on("click",".removeCom",function(){ 
        	let commentNum = $(this).attr('id');
            $.ajax({
				data : {commentNum:commentNum},
				url : "DeleteCommentCon",
				method : "post",
				context : this,
				success: function(){
					$(this).parent().remove()
				},
				error: function(){
					alert("통신실패!")
				}
			}) 
        });
    </script>
</body>
</html>