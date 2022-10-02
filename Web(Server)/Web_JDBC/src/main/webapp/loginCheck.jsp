<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
 	// 0.인코딩
 	request.setCharacterEncoding("UTF-8");

	//1.아이디와 비밀번호 가져오기
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//그리고 어제 배웠던 jdbc를 복사해서 쓸거임
	//바꿔줄 내용은 로그인할때는 필요없는 nick받아오는거 지우고 , sql문 바꿔주기! 그리고 select문쓸꺼닌까 excuteQuery로 바꿔주기! 다른코드들은 똑같은 역할을 하고있기때문에 다 똑같을거임	
	Connection conn = null;				
	PreparedStatement psmt = null; 
	ResultSet rs = null;
	
	try{
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
					String url = "jdbc:oracle:thin:@127.0.0.1:1521";
					String dbid="hr";  
					String dbpw="hr";
					
		
			conn =  DriverManager.getConnection(url,dbid,dbpw);
				
				if(conn != null){
					System.out.print("연결성공");
				}else{
					System.out.print("연결 실패");
				}
			
			
				//로그인할때는 로그인정보들을 다가져올거닌까 select문 					
			String sql = "select * from member_web where id=? and pw=?"; 	//우리가 가져온 id와 pw가 조건에 일치하는지 where문으로 적어주기
														// id가 우리가 가져온 값이라면 그리고 pw가 우리가 가져온값이라면 전에 value(?,?,?)로 바인딩변수로 넣어준거처럼
														//id='test' and pw='12345'라면 이정보를 가지고있는 모든 회원의 정보(컬럼)를 가져오는 sql구문
														
														//여기서도 id와 pw가 들어가는 자리가 1(첫번째),2(두번째)자리임 - 저번에 바인드변수 두개써서 첫번째자리에 id들어가고 두번째자리에 pw들어가게해놔음
			psmt = conn.prepareStatement(sql);  
			
			psmt.setString(1,id);     //바인딩변수로 첫번째 바인딩변수자리에 id들어가고 
			psmt.setString(2,pw);	 //두번째 자리에 pw들어가겎므
			//로그인할때 가져왔던 이 두가지 값을  위에 sql문 구문에 넣기 위해서 prepareStatement 써줬음
		 
			
			
			//select문 일때는 executeQuery()로 바꿔주기
			rs = psmt.executeQuery(); // executeQuery는 resultset이라는 형태로반환되서 int형 변수에 넣어줄수없음 !  resultset은 sql조회했을때 결과로나오는 컬럼 한줄 형태로 나오는!
			//그래서 resultSet형태로 rs라는 이름으로 담아주기 -> 그리고 이것도 나중에 닫아주기위해 전역변수로 선언해주기위해 잘라서 위로 올리기
			//ResultSet rs = psmt.executeQuery(); 
			
			//rs라는 이름으로 만든 객체에 저 executeQuery에서 실행한 값ㅇ을 담아줌
			
			
			
			if(rs.next() == true){ //sql문 실행이 성공하면-> rs.next해서 회원의 정보가 있으면		 
				//id를 세션에 저장(로그인상태를 유지시켜주기위해서)
				session.setAttribute("id",id);  //아이디를 세션에 저장하기위해 session 객체사용해서 세션생성  //아이디 이름으로 세션을 저장하고 그 세션안에 id변수값이 들어갈거임
				//세션에 정보를 담고 나면 페이지 이동하기(Main.jsp로)- 로그인하고나면 누구누구님 환영합니다 정보를 띄어주기위해 main은 jsp로 만들엇음
				response.sendRedirect("Main.jsp"); //페이지이동하는 코드는 어떤객체에 담아서 보냈을까? 보내준다 응답을하는 객체는 rsponse
			}else{ //sql문 실행이 실패하면 -> 회원의 정보가 없으면
			out.print("로그인 실패했습니다.");
			out.print("<a href='login.html'>로그인 다시하기</a>");
			}
			
			 
			}catch(Exception e){ 				
				e.printStackTrace();   
			}finally{	 
				
				try{
					
					if(rs != null){
						rs.close();}
					
					
					if(psmt != null){  
						psmt.close();} 
				
					if(conn != null){
						conn.close();}
				
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		



%>

</body>
</html>