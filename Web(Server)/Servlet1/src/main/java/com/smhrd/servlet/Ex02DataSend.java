package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02DataSend")
public class Ex02DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
			//getParameter(): 파라미터(form-name)를 지정하면 해당 데이터를 반환(반환할땐 무조건 String으로 반환)
		String data = request.getParameter("data");
		
		//System.out.println(data);
		
			//한글데이터를 전송하려면 무조건 인코딩해줘야함!
		//응답 데이터 인코딩 방식 지정
		response.setCharacterEncoding("UTF-8");
		
		//클라이언트(브라우저)한테 응답페이지에 대한 환경설정을 알려줘야함.
			// 문자데이터를 해석하는방식이 브라우저마다 달라서 이걸 알려줘야만 자기방식대로 저걸 해석함
		response.setContentType("text/html; charset=UTF-8");  //응답한 방식이 텍스트 혹은 에이치티엠엘형식이야
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("전송된 데이터 : "+ data);
		out.print("</body>");
		out.print("</html>");
	}

}
