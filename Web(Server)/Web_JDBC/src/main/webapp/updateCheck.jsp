<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

// 0.인코딩
 request.setCharacterEncoding("UTF-8");
// 1. id, select(뭐바꿀지 선택했던 옵션셀렉트), data(변경할데이터였던변수) 가져오기
 String id = request.getParameter("id");
 String select = request.getParameter("select");
 String data = request.getParameter("data");
 
 //그리고 JDBC 코드 복붙해오기~ -> update는 executeUpdate();를 사용했던 joinCheck에서 가져오는게 더 좋음!ㄴ
 //변경해줄거 -> sql문 update 문으로 바꿔주기
 
 	Connection conn = null;				
	PreparedStatement psmt = null;  
	String sql = ""; // 우선 sql변수이름으로 빈문자열로 만들어주고 그럼 우린 앞으로 sql 이름으로된 변수에 무언갈 담아줄 수 있음. 
		
	try{
	
		//클래스를 불러서 해당 db에 접근해서 연결객체를 만들기 
		
		//클래스 실행하는 코드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//										@프로젝트때 받을 주소 넣기:포트번호
				String url = "jdbc:oracle:thin:@127.0.0.1:1521";
				String dbid="hr";  // 우리가 sql 디벨로퍼에서 hr/ hr로 로그인했었음. -> 우리가 테이블 만들어논 디비에 접속하는거임 !
				String dbpw="hr";
				//이정보들을 넣어서 getconnection해주면 저 Connection객체에 담긴당.
				
		//3. DB에서 DB경로와 id,pw를 인증해줘야함 - 인증해주기 위해서 drivermanager을 사용
		conn =  DriverManager.getConnection(url,dbid,dbpw); //-> 이자리에 들어간 변수들 위에서  선언해주기  //-> 닫아주기위해 전역변수로 선언하기위해 try문위에 변수선언해놔서 여기서 선언해논건 지워주기
		//이렇게 넣어진 값에 리턴하는 객체는 Connection 객체 -> java.sql로 임포트 하고
		//conn이라는 변수에 담아주기
			
			if(conn != null){
				System.out.print("연결성공");
			}else{
				System.out.print("연결 실패");
			}
		
		//db연결한다음 sql문을 실행시키기위해 sql문 준비
		// 4. SQL명령문 준비 
		
		if(select.equals("pw")){  //가져온 select가 pw라면 pw값을 바꿔줄수있는 sql문가져올거고
			sql = "update member_web set pw=? where id"; //이 테이블에 있는 내용중에 set(어떻게 바꿀꺼냐면) pw를 =(어떤값으로) ?(우리가 받아온 데이터의 값으로) 넣어줄거고 그리고 where 이 회원정보가있는 pw컬럼을 우리가 가져온값으로 바꿔줄거다.
		}else{
			 sql = "update member_web set nick=? where id=?";
		}
											// ? : 바인드 변수 -> 사용자의 값을 sql로 전달할 수 있는 통로역할을 함
		
		
				psmt = conn.prepareStatement(sql);  
		//연결객체 conn에서 가지고 잇는 기능인  prepareStatement라는 기능으로 sql문을 준비시켜줄거다 -> createStatement로 쓰면 실행을 할때sql문을 넣어줘서 sql인젝션공격을 받을 수도 있으니 우리는 해당되는 sql문을 준비시켜논 다음에 실행을 하는 코드로 짜기위해 prepareStatement를 사용 
		// 이 prepareStatement는 어떤 객체에 들어갈거냐면 preparedStatment객체에 들어감. 그렇게 만들어진 인스턴스를 psmt라고이름주기
			//즉 우리는 연결되고 sql문을 준비시켜서 preparedStatement에 담아준다. 제일먼저 joincheck -> 회원가입을 하려면 우리가 받아온 값을 넣어줘야함. -데이터 넣어주는 sql문 insert into  
		psmt.setString(1,id);   //인덱스 1번자리에는 id을 
		psmt.setString(2,pw);	//우리가 넣어주는 값들마다 id,pw,nick이 계쏙해서 바뀔거다. 특정문자열이아니라 변수에 담아서 언제든 어떤값을 (1을넣으면 1을, 2를 넣으면 2가들어갈것임) 미리 정하지 않고 바인드변수를 통해서 코드만짜면 어떤 값을 넣어도 그거에 맞춰서 코드가 변하게되서 실행이될것임. 
		psmt.setString(3,nick);
		//sql문을 준비를했으면 이제 실행을 시켜야함
		
		// 5. SQL명령문 실행
		//psmt에 담긴것들 중에서 excute가 있음
		//executeQuery() -> select문 - 테이블 변하지 않는 경우
		//executeUpdate() -> insert, update, delete문 - 테이블 구조 변화가 있는 경우 사용
		int cnt = psmt.executeUpdate();
		//executeUpdate가 실행을 하게되면(실행이 성공적으로 되면) 어떤값이 리턴이 되냐면 int 형태로 반환이됨.
		//즉 값이 성공적으로 insert해서 들어가게되면은 실행 성공한 한행(열값=row값이)이 int형태로 반환이된다.  
		// => 그래서 저 성공한결과를 활용하기 위해 int형태의 변수(그 실행결과를 담은 변수 이름은 cnt)로 담아주기
		
		// 그 결과 값을 구분하기위해 화면에 출력해주기
		if(cnt > 0){ //sql문 실행이 성공하면					//실행을 해서 반횐되는 값이 0보다크면(1이면) 성공을 한거고 아니면 성공을 못한 상황에 따라 출력을 달리해서 구분하기
			out.print(id+"님 회원가입 성공했습니다.");	//지금은 jsp에서 사용하고있기때무네 out이라는 객체를 따로 만들지않아도 내장객체 out을 통해서 화면에 출력을 할 수 있음.
						//우리는 id라는 값을 가져와서 ~님앞에 받아온 id넣어주기
			out.print("<a href ='Main.jsp'>메인으로 가기</a>"); //그리고 로그인을 하러갈 수있게 main으로 가주기
		}else{	//sql문 실행이 실패하면
			out.print("회원가입 실패 !");
			out.print("<a href ='join.html'>회원가입 돌아가기</a>"); //회원가입 실패하면 다시 회원가입하러 돌아가기
		}
		
		//위에서 클래스를 실행해서 db경로를 넣어줘서 연결하는 객체를 만들어줘서 연결시켜놨음! 그래서 계속 db와연결되어잇는 상태이니 
		//마지막엔 꼭 연결 종료해주기!
		//-> 이건 catch문다음에 finally를 사용해서 종료해주기 !
		
		}catch(Exception e){ // java JDBC때 class가없을때 나는 classnotFound 오류랑 sql문제가 잇었을때 나는 sql오류 이런게 있엇는데 이걸 다 통틀어서 오류를 Exception으로 잡음
			
			e.printStackTrace(); //이 코드를 통해서 오류를 확인해 볼건데, 이 코드를 사용하면 어떤 오류가 생기는 지 콘솔창에서 확인할 수 있음. 
		}finally{	//위에서 에러가 나더라도 이 finally 구문은 무조건 실행이됨
			// 6. db연결 종료  -> 나중에 열린것부터 차근차근 역순으로 닫아주기
			
			try{		//이부분도 try catch문으로 감싸주기 -> finally구문안에서 또 try catch문을 만들어줄거임
				if(psmt != null){  //-> 열려있다면(psmt가 null이아니라면) 닫아줘라 라는 조건주는게 좋음
					psmt.close();} //-> psmt는 본래 try문안에서 만들어진 변수라 지역변수로 try문 밖으로나오니 그냥 사용할 수 없음!! 그러니 psmt변수 선언해준걸 잘라내기 해서 try문 위에 선언해줘서 전역변수로 만들어주기 
			
				if(conn != null){
					conn.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}








%>


</body>
</html>