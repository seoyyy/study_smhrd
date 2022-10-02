package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.domain.Board;
import com.smhrd.mapper.BoardMapper;

@RestController // Ajax요청을 전담해서 처리할 컨트롤러 
public class BoardRestController {
	// RestController에서는  @ResponseBody를 안붙여도된다. 
	
	@Autowired // 메모리에 있는 객첼르 끌어다가 집어넣어라
	BoardMapper mapper;
	
	// ajax 요청을 받아서  글 데이터 응답해주는 포조
		@RequestMapping("/boardList.do")
		public  List<Board> boardList() {
			// 글 데이터 가져오기
		List<Board> list = mapper.boardList();
		//원래는 이러고나서 객체바인딩을통해서 이데이터를 객체안에다 저장해놔야 다른데서 사용할수잇었는데 ajax는 그럴필요없음. 페이지를새로 돌려받는게아니라 
		
		//대신에 ajax가 이 list를 res로 받을수있게 보내줘야함
		//근데 스프링 컨트롤러에서는 return은 데이터를 반환하는키워드가아닌 페이지를 포우ㅓ딩방식으로이동해주는 return이었음. 근데 ajax는 페이지이동은 받지않고 무조건 데이터만 받음.
		// ajax요청을 받는 controller는 페이지이동을 안해야한다
		//그래서 해결책은 annotation!! return타입 앞에다가! @ResponseBody --> 이데이터를 응답해주겠다~
		// 이 어노테이션이 붙으면 페이지 이동이 일어나지 않음. 우리가 리턴을해주는 데이터를 그대로 응답해준다. 그럼 우리가 가져온 우리가 필욯란 list를 리턴해주자
		
		//우리가 만든 어레이리스트를 어떻게하면 자바스크립트가 이해할 수 있을까 List-> json array로 바꾸자(자바스크립트 형태로바까주자)
		// jason = javascript object notation (자바스크립트객체를 기반으로한 문장) String형태임 - 
		// 원래 js에서는 지손이라는걸이용해서 저걸 바꿀수있엇는데 스프링에서는 다른친구의 도움을 받아야함. 라이브러리 가져오자 Jackson Databind
		
		//jackson databind 라이브러리
		// 객체를 리턴 --> json데이터로 변환
		//자바스크립트가 이걸 받으면 바로 사용할수있게 ajax가 해주는거
		
		return list; //  우리가가져온 list를 자바는 아는데 자바스크립트는 모름 그래서 json으로 바꿔줫어야함
		
		}
		
		//ajax 요청을 받는 Controller 만들어주기
		@RequestMapping("/viewUpdate.do")  //연결해주는거
		public  int viewUpdate(Board vo) {
		
			//조회수 수정 (포조불러다가 일시키기)
			int cnt = mapper.viewUpdate(vo);
			
			//성공 or 실패 리턴
			
		return cnt; // @Responsebody 어노테이션 해줘야 뭔가를 리턴하더라도 페이지이동 말고 우리가원하는 문자열 정보를 리턴가능
		
		//vs에서 ajax하는거 작성하기
		}
		

}
