package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01Login")
public class Ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
	
		//응답 데이터를 인코딩해주는거
		response.setCharacterEncoding("UTF-8");
		//응답방식을 클라이언트한테(브라우저) 알려주는방법
		response.setContentType("text/html; charset=UTF-8");
		
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(id + "님 환영합니다");
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
