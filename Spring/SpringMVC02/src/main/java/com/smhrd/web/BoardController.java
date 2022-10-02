package com.smhrd.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@Controller // 어노테이션 -> 스프링의 핵심임
// 이 파일이 알바생(POJO)이다 라는걸 알려주기 위한- 스프링이 알아야함 -> 저게빠지면 이 클래스가 실행되지않음.
public class BoardController {
//어떤 클래스인지 class위에 명시해주기 (annotation)  

	// DI(Dependency Injection), 의존성 주입 을 해준다 라고함 -- 뭔가를 하려면 이게 있어야함 ( 이포조가 일을 할려면
	// 필요한 보드매퍼를 스프링이 이걸 집어넣어주는거)
	// a메모리에 완전한 객체가 올라가있어, 메모리에있는 객체를 끌어다 집어넣어라
	@Autowired // 메모리에 있는 객첼르 끌어다가 집어넣어라
	BoardMapper mapper;

	//base jsp로 이동시켜줄 controller하나 만들어주기 경로를 /로하겠다는건
	@RequestMapping("/")
	public String base() {
		//WEB-INF/view//base.jsp  포워드방식으로 이동하기위한 경로
		return "base";
		
	}

	
	
}

