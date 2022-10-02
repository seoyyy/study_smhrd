package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//url - Mapping 방법
//1.Annotation 사용
//@WebServlet : URL매핑 주석(annotation) - 이값으로 파일의 경로를 정리해줄수 잇음.
//2.web.xml 파일수정

@WebServlet("/s") 
public class Ex00CreateServlet extends HttpServlet {
	
	
	//몰라도됨 개념만설명!
	//모르는 상수가 선언되어있음 - 자바는 보통 바이트코드 형태로 입출력 
	//객체 형태를 주고받을때는 바이트배열 형태로 변환하는 과정이 필요 ->직렬화
	//직렬화해서 보냇을때 받은곳에서 받은 바이트배열을 원래상태인 객체형태로 다시 변환하는 과정  -> 역직렬화
	//serialVersionUID
	private static final long serialVersionUID = 1L;
       
	
	//생성자 : 객체 생성, 초기화
	//서블릿 객체 생성
    public Ex00CreateServlet() {
        super();
       System.out.println("생성자 호출");
    }

	
    //init -> 자바에서 객체랑 서블릿에서만들어진 객체는 다름 그래서 서블릿객체라는걸 알려주ㅓ야해서 그걸알려주는 키워드
    //serveltness
    //초기값 설정
    //서블릿 객체가 생성이 되었을 때 딱 한 번 호출 
    //서블릿 객체를 생성하고 초기화하는 작업은 비용(자원이)이 많이 필요한 작업
    //다음에 또 요청이 올 때를 대비해서 생성된 객체를 메모리에 남겨둠 ->자원절약을 위해서 
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출");
	}

	//init과 반대로 서블릿 종료시 마지막에 딱 한번 호출
	public void destroy() {
		System.out.println("destroy 호출");
	}
	
	//이 이후에는 다시 init이 다시 생성될 수 있음

	
	
	//브라우저(클라이언트)의 요청처리 해주는부분
	//요청의 방식(get/ post/ put/ delete)에 따라서
	//get -> doGet() 호출
	//post -> doPost() 호출
	
	//서비스안에 요청처리 코드작성해주면됨.	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 호출");
		doGet(request,response);
		doPost(request,response);
	}

	
	//get 방식으로 요청시 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget 호출");
		
	}

	//post가지고 요청시 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost 호출");
		
	}

}
