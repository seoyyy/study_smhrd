package com.smhrd.survlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/A02Join")
public class A02Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//post방식 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw_check = request.getParameter("pw_check");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birthday = request.getParameter("birthday");
		//int num1 = Integer.parseInt(request.getParameter("num1")); 숫자데이터? 날짜데이터? -가 있으닌까 문자데이터?
		String[] hobbies = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String say = request.getParameter("say");
		
		
		//돌려주기 위해서 돌려줄 페이지 설정(응답페이지)
		
		//응답페이지인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		//출력스트림 = 값을 출력하기 위한 통로
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("아이디 : " + id);
		out.print("<br>");
		out.print("비밀번호 : " + pw);
		out.print("<br>");
		if(pw.equals(pw_check)) {
			out.print("비밀번호가 일치합니다");
		}else {
			out.print("비밀번호가 일치하지 않습니다");
		}
		out.print("<br>");
		out.print("성별 : " + gender);
		out.print("<br>");
		out.print("혈액형 : " + blood);
		out.print("<br>");
		out.print("생일 : " + birthday);
		out.print("<br>");
		
		out.print("취미 : ");
		for(String h : hobbies) {
			out.print(h + " ");
		}
		out.print("<br>");
		out.print("좋아하는 색 : " + color);
		out.print("<br>");
		out.print("남기고 싶은 말 : " + say);
		out.print("<br>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
	}

}
