package com.smhrd.survlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02GetPost")
public class Ex02GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//요청데이터에 관한 인코딩이니 request // 요청데이터는 인코딩을 먼저지정해준다음에 거기서 꺼내와야 한글이 깨지지않음
	request.setCharacterEncoding("UTF-8");		//->포스트방식일때 인코딩 방식 
	
		//요청데이터를 받는거닌까 request에 getParameter ! 아까 네임값은 name이라고 지정해뒀음
		String name = request.getParameter("name");
		//출력할거닌까 name이라는 변수에 담아주기
		
		//화면에 name값만 출력해보기 -html문서로 응답해줄거임. 그리고 이름은 한국말포함되어있을수있으니 인코딩도해줄거(이번에는setcharacterencoding은 생략, 응답데이터에대한 인코딩 방식만 브라우저에게 알려주기)
		//그리고 그아래에 html을 응답해주겠다 출력하는거까지 작성
		
		//먼저 브라우저에게 인코딩한거 인코딩하고 출력문서 형식 알려주기 
		//지금 데이터는 텍스트 혹은 에이치티엠엘 형식이고 인코딩방식은 이걸로할거야 ~
		response.setContentType("text/html; charset=UTF-8");
		
		//그리고 지금까지했던거처럼 프린트라이터 객체 만든다음에 html문서 쭉 출력해주기
		//얘는 응답하는 데이터 다룰꺼닌까 response
		PrintWriter out = response.getWriter();
		
		//이제 아웃객체 사용해서 html문서 쭉 출력
		
		out.print("<html>");
		out.print("<body>");
		out.print(name);
		out.print("</body>");
		out.print("</html>");
		
		//지금까지 햇던 겟방식이랑 똑같음( 데이터받아주는 건 post도 똑같음 변경해줄거없음)
		
	 //post방식으로 햇을때 한글이 깨져서 옴, 그러닌까 포스트방식으로 받을때도 깨지지 않게 인코딩해줘야함
		//확인해보니 데이터가 넘어올때부터 깨지는거 ->request.getParameter 부분부터 잘못된거임.
		
		//요청데이터에 한글데이터가 담아져있음-> 포스트방식이라 패킷의 바디 부분에 데이터가 담겨져있음-> 패킷의 바디부분에 담겨져있는 그데이터를 한글인코딩방식을지정해줘야 깨지지않고 받을 수 있음.
		// 요청데이터 인코딩 방식 지정해주기(위치가 중요!) 요청데이터 받기 전에 해주기 (응답데이터 인코딩은 위치상관없음)
		//request.setCharacterEncoding("UTF-8");  ==> 요청데이터 인코딩 setCharacterEncoding("")  -> 파라미터값 얻기 전에 작성
		//response.setContentType("text/html; charset=UTF-8"); =>응답데이터 인코딩 setContentType(charset="");
//이것들은 post요청일때 인코딩방법이었음		
		
		//GET방식으로 요청시에 한글데이터 인코딩 방법  --> 겟방식일때는 데이터자체가 패킷헤더에 담겨 url주소에서 볼수있엇음
		// 즉 데이터 자체가 url에 포함이되어있으닌까 url을 인코딩해주면됨.
		//url 한글 인코딩 추가
		
	}

}
