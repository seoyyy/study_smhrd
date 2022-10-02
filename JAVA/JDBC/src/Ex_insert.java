import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//JDBC 연결순서(4단계)
	//0.(선행작업) ojdbc6.jar 파일 연결하기 (이 쓸파일에 기능이있는 파일들을 다운받기)
	//1.JDBC 드라이버 로딩
	//2.데이터베이스연결
	//3.SQL문 전송(실행)
	//4.연결종료(역순으로)
		
		//자바의 오류
		//1.컴파일 오류: 문법적인 오류(오타 등)
		//2.런타임 오류 : 문법적으로 오류가 발생하지 않지만 실행시 오류가 발생하는것 -> 다운캐스팅, 드라이버설치 
		
		//객체 생성을 위한 전역변수 선언하기 (초기화값잡아주기 null로)
		PreparedStatement psmt = null;
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		
		//1.드라이버 로딩 -> Class.forName()
		try { // 무조건 실행을 할 수 있는 기능, 예외처리가 필요한 기능
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2. 데이터베이스 연결 
		//-> DriverManager.getConnection(데이터베이스주소,아이디,비밀번호)  임포트필요
			//넣을 매개변수를 변수에 저장해서 넣어주기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			 conn = DriverManager.getConnection(url, db_id, db_pw);
			//임포트 필요
			
//			if(conn != null) {
//				System.out.println("연결 성공입니다!");
//			}
			 
			 System.out.print("가입 아이디 : ");
			 String id = sc.next();
			 System.out.print("가입 비밀번호 : ");
			 String pw = sc.next();
			 System.out.print("가입 이름 : ");
			 String name = sc.next();
			 System.out.print("가입 나이 : ");
			 int age = sc.nextInt();
		
			 
			//3.sql 전송
			//csm, 0117, 채수민, 22
//			String sql = "insert into members values('"+ id +"', '" + pw+ "', '" + name + "', "+ age + ")";
	
			 String sql = "insert into members values(?, ?, ?, ?)"; //->뭐가들어갈지모르닌까 ?, 값을 고정하고싶으면 그냥 그 숫자넣고 아래에 지정해준거 주석처리
			 
			 //sql문을 db에 conn변수를이용해서 전달하기
			 psmt = conn.prepareStatement(sql);
			 
			 psmt.setString(1,id);  //-> java는 0번부터시작하지만 db에서는 1번이 시작점
			 psmt.setString(2,pw);
			 psmt.setString(3,name);
			 psmt.setInt(4,age);
			 
			//sql문장 실행 요청하기 (db에서 엔터치듯이
			int cnt = psmt.executeUpdate();
			
			if(cnt >0) {
				System.out.println("insert 성공!");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			//try구문에서 실행시 발생되는 오류에 대해 처리할 수 있는 기능
			System.out.println("드라이버 연동 오류");
			e.printStackTrace();
			
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 오류");
			e.printStackTrace();
	
		//4.연결종료->닫아주는 순서가 중요(역순으로)
			//try,catch 어디서든 상관없이 사용이됐다면
			//반드시 마지막에 연결 종료하기 !
		}finally {
			
				try {
					if(psmt != null) {  //if문이 try안에 들어가있는게 좋음
					psmt.close();
					}if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		}//main

		
		
		
	}//clasee

