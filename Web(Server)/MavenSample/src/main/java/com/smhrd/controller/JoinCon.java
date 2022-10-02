package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.DAO;
import com.smhrd.domain.JDBC;
import com.smhrd.domain.Member;


public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//닉네임에 한글이 포함되어있을수 있으니 post방식으로 보내온 요청 데이터 인코딩
		request.setCharacterEncoding("UTF-8");
		
	//1.요청 시 보내온 파라미터 값 받기
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		//저 세가지 값을 한 회원정보로 묶어놓기 -> 이 세가지값을 묶어놓을 VO클래스 생성하고오기 
		//묶어놓은 객체 멤버 를 생성해주기 -> 이 멤버는 이 서블릿이 있는 패키지와 다른 패키지에있으니, 다른 패키지에있는 클래스같은걸 가져다 쓸때는 임포트 해주기
		Member m_vo = new Member(id,pw,nick);
		
		
//		JDBC jdbc = new JDBC();
//		int cnt = jdbc.join(m_vo);
		
		DAO dao = new DAO();
		int cnt = dao.join(m_vo);
		
		
		//cnt가 0일경우 제대로 삽입되서 이동시켜주기/ 삽입이제대로안됫을때는 다시 join.jsp로 이동
		if(cnt>0) {
			response.sendRedirect("main.jsp");			
		}else {
			response.sendRedirect("join.jsp");
		}
		
		
	}

}
