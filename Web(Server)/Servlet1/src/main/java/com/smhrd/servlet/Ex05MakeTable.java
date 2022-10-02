package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Ex05MakeTable")
public class Ex05MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	//1단계로 응답페이지만 작성하면됌 - html로 응답페이지를 작성해줄거임
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int num1 = Integer.parseInt(request.getParameter("num1"));
		
		 
		 
		 
		 
		 
		 //여기가 응답페이지 테이블 만드는거 

		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border='1'>");
		out.print("<tr>");
//		out.print("<td>1</td>");
//		out.print("<td>2</td>");
//		out.print("<td>3</td>");
//		out.print("<td>4</td>");
//		out.print("<td>5</td>");
//		out.print("<td>6</td>");
//		
		for(int i = 1; i<= num1; i++) {
			out.print("<td>"+ i + "</td>");
		}
		out.print("</tr>");
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
