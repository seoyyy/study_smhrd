package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//0.인코딩
		request.setCharacterEncoding("UTF-8");

		//1.아이디와 비밀번호 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		  PreparedStatement psmt= null;
		   Connection conn = null;
		   ResultSet rs = null;
		   
		   
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
		          // ? : 바인드 변수 -> 사용자의 값을 sql로 전달할 수 있는 통로 역할 (?,?,?)
		                
		          String sql = "select * from member_web where id=? and pw=?";
		          psmt = conn.prepareStatement(sql);
		          psmt.setString(1, id);
		          psmt.setString(2, pw);
		        
		          // 헤헤에ㅔ헤에ㅔ헿에에에에레넬 너무졸려어언멍ㅁ넝
		           
		          // 5. sql 명령문 실행
		          // executequery() select문 테이블 변하지 않는 경우
		          // executeupdate() delete insert update 등 테이블 구조 변화 생기는 경우
		          rs = psmt.executeQuery();
		         
		          if(rs.next()==true){
		        	  //id를 세션에 저장
		        	 session.setAttribute("id",id); 
		        	  //세션에 정보를 담고 나면 페이지 이동(Main.jsp)
		          	  response.sendRedirect("Main.jsp");
		        	  
		          	  String upw =rs.getString();
		          	  
		          	  //세션객체 생성하기
		          	  HttpSession session = request.getSession();
		          	  //dto객체를 세션에 저장
		          	  session.setAttribute("dto", dto);
		          	  
		          	  
		          	  
		          }else{
		        	  System.out.print("로그인 실패했습니다.");
		        	  response.sendRedirect("login.html");
		        	  //out.print("<a href='login.html'>로그인 다시하기</a>");
		          }
		          
		          
		          
		       
		   } catch (Exception e) {
		      e.printStackTrace();
		   } finally {
		      // finally문 무조건 실행
		      //  6. 연결 종료
		      try{
		      if(rs!=null)rs.close();
		      if(psmt!= null) psmt.close();
		      if(conn!= null) conn.close();
		   } catch(Exception e) {
		      e.printStackTrace();
		    }
		   }


		
		
		
	}

}
