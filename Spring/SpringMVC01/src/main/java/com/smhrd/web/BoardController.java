package com.smhrd.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	// 이 관계를 boardController가 boardMapper에 의존하는 관계라고 한다.
	// ==> 객체 생성한거랑 똑같은 효과가 남. new하면서 생성자 생성 안해도 !

	// 업무지시하기 -> 메소드를 이용해서

	// @RequestMapping("/")

	@RequestMapping("/boardList.do") // 메서드와 요청url을 맵핑(연결) //우리가 요청할 url주소 // 이 업무를 언제 실행해야하는지 알려주기( 어떤 요청이 들어올때 이
										// 메소드를 실행해야하는지)
	public String boardList(Model model) {
		// 매개변수로 필요한 request 등 객체를 받아올 수 있다.
		// 근데 이게 좀 무거워서 다른거사용할 수 잇음
		// Model => 객체 바인딩용 객체 -> 셋어트리뷰트랑 사용법 비슷

//		//boardList.jsp로 이동   --> 포워딩 방식으로 이동하기 ( jsp가 보안파일안에 있어서 sendredirect로 쓸수없음)
//		//forward
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/boardList.jsp");
//															//얘가 webapp 파일에 바로있는게 아니라 숨어있어서 경로를 적어줘야함		
//		rd.forward(request,response);

		// 게시판 데이터를 가져오기
		// 글번호, 제목, 작성자, 내용, 작성일, 조회수 를 저장할거야 --> 이걸한번에 묵어주기 위해 VO 클래스를 만들어줘서
		// arrayList형태로가져오기
		List<Board> list = mapper.boardList();
		// 이 뒤에있는 매퍼실행 결과를 = 앞에 list에 담겠다

//		list.add( new Board(1, "스프링 게시판","한서영","게시판 만들기","2022-06-15",0)); // 글을가져왔다고 생각하고 임의의 리스트만들어줌
//		list.add( new Board(2, "스프링 게시판","관리자","게시판 만들기","2022-06-15",0)); 

		// 이렇게 리스트를가져왔는데 이걸 사용자 눈앞에 보여주려면 어디서 출력해야하나 --> 뷰
		// 그럼 컨트롤러에서 이 리스트를가져다가 뷰에게 가져다줘야함 그러려면 객체바인딩을 해줘야함.
		// 객체바인딩(request영역에 list 저장)
		// request.setAttribute("list", list); //키값 - 데이터를 꺼낼때 무슨이름으로 꺼낼건지, 실제데이터(우리가
		// list라고 만들어놓은 객체 데이터를 그대로 넣어서 request에 저장시켜놓을거야)
		// 객체 바인딩을 통해서 보드리스트에서 저 데이터를 꺼내다 쓸수잇게 만들어줘야함.

		model.addAttribute("list", list);

		// 리스트를저장까지했으니
		// 이제 view에가서 우리가 저장해논 list를 꺼내서 사용만하면됨.

		return "boardList"; // 리턴값 == View의 논리적인 이름 -> 그럼 포워딩방식으로 이동안해도 페이지 이동일어남
		// view로 갈수있는 길을 알려주기 -> 근데 주소 매번치기 귀찮으닌까 다때버려 확장자 까지 ! 이미 beans로 주소를 변수에 담아둠

	}

	// boardForm.jsp로 이동만 하는 매소드
	// @RequestMapping --> Get/Post 둘다 받음
	// Get,Post 두 방식을 이용해, 같은 요청이라도 다른 기능을 하게 만들 수 있다.
	// @GetMapping 쓰는 이유는 간단 --> a태그 or location.href 이동 == GET방식으로 처리함
	@GetMapping("/boardInsert.do")
	public String boardForm() {
		// 스프링에서 메소드할때 스트링으로 반환하는 이유는 우리가 다음 뷰를 어디봐야하는지 알려주기위한 메소드닌까 - 뷰의 논리적인 이름을
		// 알려줘야해서 스트링을 반환해야함

		return "boardForm";
		// .jsp 쓸필요없음 뷰리저버라는 친구가 알아서해줄거

	}

	@PostMapping("/boardInsert.do")
	public String boardInsert(Board vo) {
		// vo 필드명 == input태그의 name -> 그래야 vo로 한꺼번에 묶어서 우리한테 달라고 할 수 가 있음
		// 기본 생성자 필수 @NoArgsConstructor

		/*
		 * //파라미터 수집 (겟파라미터 해주는! 근데 누구한테 겟파라미터해줘야해? 요청으로부터!) String title =
		 * request.getParameter("title"); String writer =
		 * request.getParameter("writer"); String content =
		 * request.getParameter("content");
		 * 
		 * Board vo = new Board(); vo.setTitle(title); vo.setWriter(writer);
		 * vo.setContent(content); // ---------------데이터 준비 끝 ------------------ 옛날에하던
		 * 파라미터수집 -
		 */

		// 게시글 저장하는 기능
		mapper.boardInsert(vo);

		// 목록 페이지 이동
		// 다시 POJO를 호출해야하는 경우 - Redirect 사용
		return "redirect:/boardList.do";

	}

	//게시글 상세보기 페이지로 가는 컨트롤러
	// http://localhost:8083/web/boardContent.do/5
	@RequestMapping("boardContent.do/{idx}") //path Variable의 키값 선언 - 앞에서 우리가 써논 키값을 애내로 써라			
	public String boardContent(Model model, @PathVariable("idx") int idx) {  //지금껏 우리는 방금페이지로 어디로가야할지 알려주ㅓ서 url 알려주기위해 string타입 반환해왔는데 왜 void?
		//근데 리턴해준적없는데 저기로 이동되었음 정상적으로! WEB-INF/views/boardContent.jsp로! 왴?! 
							//첫번째방법. 쿼리스트링을 이용한 데이터 전송 방법			
										//만약 1개만 받을거라면, 매개변수의 변수명 ==name값 이면, 파라미터 수집할 수 있다.
		// @RequestParam("idx") int nume 얘가 하는역할은 name이 idx인 파라미터의 값을 int num안에 담아달라
		//boardContent.do/{idx}: {}위치에 오는 값에 idx라는 key값을 부여
										//int idx = Integer.parseInt(request.getParameter("idx")) 원래 이렇게 인티저로 바꿔서 int로 가져올수있엇는데 스프링에선느 알아서 저렇게해줌
										//@PathVariable int idx : Path Variable값을 idx에 담기
		// view 이름을 리턴 X --> 페이지이동
		// (메서드이름 == view의 논리적인 이름 ) 라면, void를 사용해도 페이지가 이동된다.
		
		//보드컨텐츠에서는 하나의 특정한 글 데이터를 가져오기
			// 객체바인딩을 통해 잠깐 request한테 맡겨놧다가 board.jsp로이동했다가 다시받아오는
		
		Board vo = mapper.boardContent(idx);
		
		//확인해보기
		System.out.println(vo.getTitle());
		 // 객체바인딩 필요
		model.addAttribute("board", vo);
			//모델이라는 친구로부터 board라는 이름으로 우리가 지금저장하고싶은 대상
	
	
	return "boardContent"; // Path Variable을 사용할때는, 반드시 직접 view를 알려줄것
	}
	
	
	//게시글 삭제할 알바생 필요 ! (메소드) 알바생을쓰려면 리퀘스트매핑을 제일먼저 달아줘야함
	//boardList.do?idx=4
	@RequestMapping("/boardDelete.do")//만약에 boardDelete.do라는 요청이들어오면 아래에 메소드를 실행시켜주세요
	public String boardDelete(int idx) {
		//특정한 하나의 게시글 삭제 기능
		mapper.boardDelete(idx);  //-> 매퍼자바클래스(baordMapper)에 이거 sql문 담아놨으니 boardMapper를 불러와야하는데 우리가 이클래스 위에 boardMapper를 autoweird 어노테이션으로 mapper로 해놨음. 
		//idx가 포함된 쿼리스트링이 붙어있는 요청을 받았다고 생각해보자 / int idx 하나만 받고자하면 이렇게만 저 메소드 매개변수에 넣어줘서 쓰면되는데
		// insert처럼 여러개의 값이 필요하면 board
		
		
		//목록페이지로 이동  -> 리턴해주면됨
		// "boardList.do"라고만 쓰면  /WEB-INF/views/boardList.do.jsp 로 잘못된 주소를 받아드림
		//그래서 컨트롤러로 보내기위해서는 redirect를 쓰기로했음 여기로 보내주세요 
		return "redirect:/boardList.do";
		
	}
	
	// Update페이지로 이동하는 Controller 필요
	// /boardGoUpdate.do?idx=4
	@RequestMapping("/boardGoUpdate.do")
	public String boardGoUpdate(int idx, Model model) {
		
		//특정 하나의 게시글 정보를 가져오기
		// 글불러오기랑 똑같이 작성하면됨. 재사용
		Board vo = mapper.boardContent(idx);
		
		//그리고 이 값들을 jsp로 보내주기 위해 저장해야함.
		// 저장(객체바인딩)
		
		model.addAttribute("board",vo);
		
		
		// boardUpdate.jsp로 이동
		// /WEB-INF/views/boardUpdate.jsp
		return "boardUpdate"; //페이지 이동은 return
	}
	
	//update시켜주는 메소드
	//form태그로 여기에 접근할거임(title, idx, content 이렇게 3가지를 받아야하기때문에 저 board타입을 이용하고 form이용해서 보내주기만)
	@RequestMapping("/boardUpdate.do")
	public String boardUpdate(Board vo) {
		
		//사용자가 입력한 데이터로, update
		mapper.boardUpdate(vo);
		//(목록? 상세보기?)페이지 이동
		return"redirect:/boardList.do";
		
		//상세보기 페이지로 갈때
		//얘도 가저가야하는 데이터가 있어서 무조건 jsp로 통할 수 없고  컨트롤러 통해야함.
		// return "redirect:/boardContent.do/" + vo.getIdx();
	}
	
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public ModelAndView Test() {
		ModelAndView mav = new ModelAndView();

		String url = "http://127.0.0.1:5000/tospring";
		String sb = "";
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

			String line = null;

			while ((line = br.readLine()) != null) {
				sb = sb + line + "\n";
			}
			System.out.println("========br======" + sb.toString());
			if (sb.toString().contains("ok")) {
				System.out.println("test");
				
			}
			br.close();

			System.out.println("" + sb.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.addObject("test1", sb.toString()); // "test1"는 jsp파일에서 받을때 이름, 
        						//sb.toString은 value값(여기에선 test)
		mav.addObject("fail", false);
		mav.setViewName("test");   // jsp파일 이름
		return mav;
	
	}
	
}
