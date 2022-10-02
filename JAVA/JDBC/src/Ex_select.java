import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_select {

	public static void main(String[] args) {
		
		//객체 생성
		Connection conn = null ; 
		PreparedStatement psmt = null ;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		//1.드라이버 로딩 -> class.forName()
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2.데이터 베이스 연결 -> DriverManager.getConnection();	
		//실제로 명령어들을 데이터베이스에 전달하기위한 연결  // 프로그램적인 연결은 되어있음.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
		 conn = DriverManager.getConnection(url, db_id, db_pw);
			//드라이버매니저를 통해서 url ..등을 연결하자 
		 psmt = null;
		
		//테이블을 조회하는 sql문 작성
		//String sql = "select * from members";
		
		 
		 //사용자로부터 검색값 입력받기
		 System.out.println("검색할 아이디 : ");
		 String id = sc.next();
		 System.out.println("검색할 비밀번호 : ");
		 String pw = sc.next();
		 
		 //찾고자하는 조건에 대한 sql문 생성
	String sql = "select name, age from members where id = ? and pw = ? ";

		 
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);	//위에 ? 쓴거를 연결해주기 1번자리에는 id 넣는다고
		psmt.setString(2, pw);
		//psmt저거 실행시켜주세요~
		//excuteUpdate() : 삽입, 삭제, 수정 등의 테이블의 내용이 바뀌는 것
		//excuteQuery() : 조회와 같은 테이블의 전후가 똑같은 작업
		rs = psmt.executeQuery();
		
		//데이터가 존재한다면 반복적으로 확인 진행하기
		while(rs.next()) {
//			String id = rs.getString(1);
//			String pw = rs.getString(2);
//			String name = rs.getString(3);
//			int age = rs.getInt(4);
//			
//			System.out.println(id + "/" + pw + "/" + name + "/" + age);
//	
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			System.out.println(name + "/"+ age);
		}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
				try {
					if(rs != null) {
						rs.close();
						}if(psmt != null) {
						psmt.close();
					}if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
		}
		

	}

}
