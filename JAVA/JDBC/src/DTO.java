import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTO {
//데이터베이스에 접근을 하는 기능들을 정리하는 class
	//Database Transfer Object
	
	//1.동적 드라이버 연결
	//2.데이터베이스 연결
	//3.sql전송(insert, select, update, delete) 
	//4.연결종료
	
	//이과정들을 메소드로 구현하여 관리 !!
	
	//객체생성
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0; //결과를 확인할 수 있는 변수
 	
	
	public void getconn() {
		//드라이버 연결 및 데이터베이스 연결 메소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
	 conn = DriverManager.getConnection(url, db_id, db_pw);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}
	//연결을해줬으니 이제 연결을 종료하는 메소드 생성
	public void close() {
		
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
	
	//insert기능을 갖는 메소드 
	
	public String insert(String id, String pw, String name, int age) {
		getconn();
		
		 //sql문을 db에 conn변수를이용해서 전달하기
		 try {
			 String sql = "insert into members values(?, ?, ?, ?)";
			 
			psmt = conn.prepareStatement(sql);
			 psmt.setString(1,id); 
			 psmt.setString(2,pw);
			 psmt.setString(3,name);
			 psmt.setInt(4,age);
			 
			 cnt = psmt.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 close();
		 
		// return cnt;
	
	}
}
