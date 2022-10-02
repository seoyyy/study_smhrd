<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
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
	//0.인코딩
	request.setCharacterEncoding("UTF-8");
	//1.id,select, data가져오기
	String id = request.getParameter("id");
	String data = request.getParameter("select");
	String select = request.getParameter("select");

	 PreparedStatement psmt= null;
	   Connection conn = null;
	   String sql="";
	   
	   
	   try {
	   // jdbc
	   // 1. oracle DB와 연결해 줄 수 있는 lib import(web-inf >lib)
	   // 2. oracle lib 파일에서 db와 연결할 수 있는 class 실행
	   // 예외 처리 : 자바에서 2 종류 오류 -> Exception 으로 모든 오류 잡을 수 있음
	   //         1) 컴파일 오류 - 문법적 오류
	   //         2) 런타임 오류 - 실행 해야지만 알 수 있는 오류
	    //                    -> 예외 처리문 사용 (try-catch)
	   
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	          // 3. DB 경로, id/pw 인증
	          //                        프로젝트 때 받을 주소
	          String url = "jdbc:oracle:thin:@127.0.0.1:1521";  
	          String dbid = "hr";
	          String dbpw = "hr";
	          
	          conn = DriverManager.getConnection(url, dbid, dbpw);
	          if (conn != null) {
	             System.out.print("연결 성공");
	          } else {
	             System.out.print("연결 실패");
	          }
	          
	          // 4. sql 명령문 준비 
	          // ? : 바인드 변수 -> 사용자의 값을 sql로 전달할 수 있는 통로 역할
	                
	        	if(select.equals("pw")){
	         	sql = "update member_web set pw=? where = id=?";    		
	        	}else{
	          	sql = "update member_web set nick=? where = id=?"; 		
	        	}  
	          
	          psmt = conn.prepareStatement(sql);
	          psmt.setString(1,data);
	          psmt.setString(2,id);
	          
	          
	          // 5. sql 명령문 실행
	          // executequery() select문 테이블 변하지 않는 경우
	          // executeupdate() delete insert update 등 테이블 구조 변화 생기는 경우
	          int cnt = psmt.executeUpdate();
	          
	          if (cnt > 0) {
	             // sql문 실행 성공하면 => 회원정보수정이 성공하면
	             out.print(id + "님 회원정보 수정했습니다");
	             out.print("<a href='Main.jsp'> 메인으로 가기 </a>");
	          } else {
	             // sql문 실행 실패 시
	             out.print("회원정보 수정 실패 !");
	             out.print("<a href='update.html'> 회원가입 돌아가기 </a>");
	          }
	          
	   } catch (Exception e) {
	      e.printStackTrace();
	   } finally {
	      // finally문 무조건 실행
	      //  6. 연결 종료
	      try{
	      if(psmt!= null) psmt.close();
	      if(conn!= null) conn.close();
	   } catch(Exception e) {
	      e.printStackTrace();
	    }
	   }
	
	
%>



</body>
</html>