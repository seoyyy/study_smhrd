package Controller;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DTO {
	//


	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	Statement stmt;
	Scanner sc = new Scanner(System.in);

	// 결과 확인할 수 있는 변수
	int cnt = 0;

//	public void getconn() {
//		// 드라이버 연결 및 데이터베이스 연결 (1&2번 같이) 메소드
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
//			String db_id = "campus_a_0310_4";
//			String db_pw = "smhrd4";
//
//			conn = DriverManager.getConnection(url, db_id, db_pw);
//
//		} catch (Exception e) { // 모든 오류 한 번에 잡기 위해 Exception
//			e.printStackTrace();
//
//		}
//	}

	// 연결 종료하는 메소드 생성
//	public void close() {
//		try {
//			if (rs != null) {
//				rs.close();
//			}
//			if (psmt != null) {
//				psmt.close();
//			}
//			if (conn != null) {
//				conn.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

//	public int insert(String id, String pw) {
//
//		getconn();
//
//		try {
//
//			String sql = "insert into player values(?, ?, 0)";
//			psmt = conn.prepareStatement(sql); //자바에서 디비 sql 문을 변환하는(넘어가게하는)기능 
//
//			psmt.setString(1, id);
//			psmt.setString(2, pw);
//			// sql 문장 실행 요청하기
//			cnt = psmt.executeUpdate(); //엔터기능 !
////			cnt는 0이나 1처럼 int값으로 출력됨. 0은 실행이잘안되서 false, 1은 실행이 잘되서 true라는 뜻 
////			그래서 잘 인설트됬나 결과 확인에 사용할수있음.
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		close();
//
//		return cnt;
//
//	}

//	public int checkID(String new_id, String pw) {
//		getconn();
//		int cnt = 0;
//
//		try {
//
//			String sql = "select * from player where id=? AND pw= ?";
//
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, new_id);
//			psmt.setString(2, pw);
//
//			// executeUpdate() -> Table의 내용이 바뀔 때 ex. 삽입,삭제,수정
//			// executeQuery() -> 실행 전 후가 바뀌지 않을 때 ex.select
//			rs = psmt.executeQuery();
//
//			// id, 비밀번호가 일치할 때 1, 일치하지 않을 때 0
//			if (rs.next()) {			//실행되서 그다음 줄에 같은값 데이터가 있으면 1, 없으면2
//				cnt = 1;
//			} else {
//				cnt = 0;
//			}
//		}
//
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		close();
//		return cnt;
//
//	}

//	public void rank() {
//		getconn();
//
//		try {
//			String sql = "select * from player order by money desc";
//			psmt = conn.prepareStatement(sql);  //sql문을 자바에서 디비로 전환하ㅡ는부분
//			rs = psmt.executeQuery(); //엔터처리부분
//
//			while (rs.next()) { // 컬럼네임 다음부분으로가서거기에 데이터가 있나요?
//				System.out.print(rs.getString("ID") + "\t");
//				System.out.println(rs.getString("MONEY") + "\t");
//			}
//			System.out.println();
//			close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		close();
//
//	}

	int fail = 0;
	int amount = 0;

	public void game(String id) {
		getconn();
		try {
			String sql = "select s.* from (select burger,recipe,num,price from hamburger order by DBMS_RANDOM.VALUE) s where rownum < 2 ";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			rs.next();
			
			int correctNum = rs.getInt("num");
			String correctBurger = rs.getString("burger");
			String correctRecipe = rs.getString("recipe");
			int correctPrice = rs.getInt("price");
			
			System.out.println();
			System.out.println();
			System.out.println(correctBurger + " : " + correctRecipe);
			System.out.println("[1]빵 [2]고기 [3]치킨패티 [4]새우패티 [5]토마토 [6]양상추 [7]데리야끼소스 [8]칠리소스 [9]치즈");
			System.out.println();

			try {
				System.out.println("다 외웠으면 enter키를 눌러주세요~");
				System.in.read();  		//enter키 누르면 넘어가는 기능 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			for (int i = 0; i < 50; i++) {
				System.out.println();
			}
			System.out.println("[1]빵 [2]고기 [3]치킨패티 [4]새우패티 [5]토마토 [6]양상추 [7]데리야끼소스 [8]칠리소스 [9]치즈");
			int answer = sc.nextInt();
			if (answer == correctNum) {
				System.out.println("정답입니다!");
				amount += correctPrice;
				
				try {
					String sql1 = "update player set money=? where id = ?";
					psmt = conn.prepareStatement(sql1);

					psmt.setInt(1, amount);
					psmt.setString(2, id);
					
					// sql 문장(update,insert시) 실행 요청하기
					cnt = psmt.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();
				}
				

			} else {
				System.out.println("오답입니다");
				fail++;
				if (fail == 5) {
					System.out.println("GAME OVER!");
					System.exit(0);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

}
