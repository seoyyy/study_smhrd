<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- 함수정의  (버튼에 이벤트주는방법 2개. 버튼에 온클릭을걸고 함수를정의해서 넣을거면 head부분에 넣는게 좋고, 버튼에 제이쿼리를이용해 $('button').on('click',function){} 이렇게할거면 body끝부분에 정의하는게 좋음
	그리고 페이지 이동을 함수로 정의 하는 이유는 나중에 js파일로 따로 빼려고! 나중에 한파일로 빼고 src=""해서 불러내어 사용하면됨.
-->
	<script type = "text/javascript">
	function goList(){
		//boardList페이지로 이동 
		// PathVarialbe을 사용중인 페이지에서는 /ContextPath/를 붙이자.
		//   / 는 http://localhost:8083/  까지 포함 
		location.href = '/web/boardList.do'
		// 모든 컨트롤러로 이동하는 경로 정할때 /web/붙여지면 오류막을수있음
	}
	
	function goDelete(idx){
		//글이 삭제되는 기능 - 삭제되려면 sql쿼리를써야함. 
		//그리고 알바생이 필요해서 controller에 만들어줘야함 - 만들어주고왔음 
		//이제 불러다가 완성시키자
		
		//얘도 결국 controller가 가진 알바생  boardDelete.do를 호출해야함/ 방금만들고온 메소드를 호출(요청)할수있어야함
		location.href='/web/boardDelete.do?idx=' + idx;  //우린항상 idx를 달라했어! 근데 이렇게만 보내면 idx가 안보내짐
												// 떠넘겨버리기
		//나중에 js파일로 다 넘겨버릴거라서 여기서는 el을쓰지못하는 문제점이있어서 받아와야하는 매개변수를 떠넘겨버렸음!
	}
	
	function goUpdate(idx){// idx를 매개변수로 받아와서
		//이전내용도 보여줘야해서 select와 update가 둘다일어나야함
		
		location.href = "/web/boardGoUpdate.do?idx=" + idx; //그 매개변수를 사용
		
	}
	
	</script>

</head>
<body>

<%-- EL은 scope(pageContext, request, session, application)에서 데이터를 가져옴  
	.getAttribute()와 유사
	
	${ scope.이름.필드명} 
		근데 scope 생략가능 / 근데 같은이름으로 저장해논게 있으면 써서 구분
	${ 이름.필드명 }
	
	pageContext < request < session < application
	name값이 겹치면 유지시간이 짧은 scopoe의 것을 가져온다
--%>

${board.title}


<!-- 저장할때 지정한 이름으로  el로 꺼낼때도 꺼내야한다.-->
 
<div class="container">
  <h2>SpringMVC01</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">
    
    <table class="table table-hover">
    	작성자 : 한서영
    	내용 : 스프링 게시판
    	<tr>
    		<td> 제목 : </td>
    		<td> ${ board.title} </td>
    	</tr>
    	<tr>
    		<td> 작성자 : </td>
    		<td> ${ board.writer }</td>
    	</tr>
    	<tr>
    		<td> 내용 : </td>
    		<% pageContext.setAttribute("newLine","\n"); %>  <%--이때 string newLine= "\n"; 이런식으로 변수에 저장하면안댐. el은 scope영역에서 가져오는거라 서버에 저장시키면 안댐 --%>
    		<td> ${ fn:replace(board.content, newLine,"<br>") } </td>
    		<%-- fn:replace(대상문자열, 바꿀문자열, 바꾼뒤 문자열) --%>
    		<%-- \n을 replace 하고 싶다면, scope에 문자열로써 담아뒀다가 꺼내서 써야함. \를 컴퓨터가 문자열로인식하지못해서  --%>
    		<%-- "el공부중 <br> 잘 되나 <br> 확인해볼게용" --%>
    	</tr>
    	
    	<tr>
    		<td> 작성일 : </td>
    		<td> ${ fn:split( board.indate," ")[0] } </td>
    		<%-- fn:split("대상문자열","구분자") 햇더니--%>
    		<%-- ["2022-06021",  "17:16:32"] 배열로 반환됨 그래서 그중 필요한 0번째 출력해주라[0] --%>
    	</tr>
    	
    	<tr>
    		<td colspan="2" align="center"> <!-- td여러개를 합치려면 colspan (두 열을 합침)  -->
    			<button onclick="goUpdate(${board.idx})" class="btn btn-sm btn-info" >수정</button>
    			<button onclick="goDelete(${board.idx})" class="btn btn-sm btn-warning">삭제</button>
    			<button onclick="goList()" class="btn btn-sm btn-success">목록</button>
    		</td>
    	
    	</tr>
    
    </table>
    
   
    
    
    </div>
    <div class="panel-footer">빅데이터 한서영</div>
  </div>
</div>

<!--  
<script>
$('button').on('click',function){} 
</script>
-->

</body>
</html>