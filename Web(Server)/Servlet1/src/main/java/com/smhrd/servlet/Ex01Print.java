package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Ex01Print")
public class Ex01Print extends HttpServlet {
	private static final long serialVersionUID = 1L;   //지워도됌


	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter : 텍스트 출력 스트림(통로)  -애가 있어야지만 어떤 텍스트르 ㄹ보여줄건지 출력가능
		PrintWriter out  = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello Servlet</h1>");
		//out.print("<img src = \"\">");
		out.print("</body>");
		out.print("</html>");
	}

}
