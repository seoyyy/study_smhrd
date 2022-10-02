package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.BoardDAO;
import com.smhrd.domain.Comm;


public class AddCommentCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boardNum = request.getParameter("boardNum"); //일단 그대로 받고
		
		//string -> bigDecimal로 바꿔주야함 - bigdecimal은 객체라서 객체 생성하듯이 불러오면됨.
		BigDecimal boardNumDecimal = new BigDecimal(boardNum);
		
		//comment도 받아주기
		String com = request.getParameter("com");
		//vo에 게시물번호랑 com을 하나의 객체로 묶을수있게 생성해놧음.  요타입으로 묶어주기
		//comm타입으로 객체생성
		Comm comm = new Comm(boardNumDecimal, com);
		//이렇게 묶어둔 comment타입의 객체를 dao안에 메소드를 호출할때 사용하면됨		
		BoardDAO dao = new BoardDAO();
		//최종적으로 정수형의 값을 반환을 한건데 이값이 의미하는건  삽입이 됫는지 안됫는지가 아닌 현재 작성한 댓글의 테이블 상 시퀀스 번호를 반환( 댓글들을 식별할 수 있는 값)
		int commNum = dao.addComment(comm); //dao에 댓글 작성하는거닌까 addcomment메소드 호출해주기 그리고 지금 삽입하려는 댓글에 대한 정보를 묶어둔 comm객체 담아주기
		
		PrintWriter out = response.getWriter();
		out.print(commNum);
	}
	}
//최종적으로 댓글이 작성이되고나면 서버는 클라이언트한테 뭘줄거냐면  현재 삽입된 댓글의 시퀀스 번호를 줄거임
	//이걸가지고 board가서 삭제할때 id를 시퀀스번호로 지정하고 서버에게 시퀀스번호로된 id를 삭제하라고 시키기
