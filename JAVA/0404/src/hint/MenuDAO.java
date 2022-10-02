package hint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuDAO {
//데이터베이스에 접근하는 역할의 클래스
	
	
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";  //오라클사에서 정한url주소  localhost-현재이코드를작성하고있는 내꺼컴퓨터db에 접속한다
	private String id = "hr";
	private String pw ="hr";
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement psmt;
	
	
	//모든메뉴정보를 select해올수있는 메소드(접근해 반환해주는-리턴타입을뭘쓸지가 중요-여러개의 메뉴를 한번에 담을수있는 배열이나 어레이리스트 사용가능)
	//-menudto가 메뉴 한가지를 보여주는 클래스가됨
	public ArrayList<MenuDTO> selectAll() {
		ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();
		
		try{
			conn = getConnection();
		//접속을 못햇을때 예외경우 오류도 잡아주기
		
		
		// 3. SQL문 준비
		
		String sql = "select * from menu";   //->sql문 준비가끝나면 이거에대한 객체가생김
		 psmt = conn.prepareStatement(sql);  //->야 준비완료한 sql문 가져와
		
		
		
		// 4. SQL문 실행
		 rs = psmt.executeQuery();
		
		// 5. 실행결과 처리
		while(rs.next()) {
			int menu_num = rs.getInt("menu_num");
			String menu_name = rs.getString("menu_name");
			int menu_price = rs.getInt("menu_price");
			
			MenuDTO dto = new MenuDTO(menu_num, menu_name, menu_price);
			
			list.add(dto);
			
		}
		
		// 6. 접속 종료 (접속을끊어야하는이유 : 통로를닫지않고 그대로놔두게되면 디비컴퓨터에 과부하가 올수있음) - 역순으로닫아주기
		
		
		
		
		
		}catch(ClassNotFoundException e) { //저 드라이버 경로에있는 클래스를 찾을 수 없을때 
			e.printStackTrace();
		}catch(SQLException e) { //sql에 접속하지못한경우 오류잡아주기 
			e.printStackTrace();
		}finally {
			try {
			close(); //try문에서 예외가발생하더라도 스킵하지않고 무조건 실행하는구역
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	private void close() throws SQLException {
		if(rs != null) rs.close();
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
	}

private Connection getConnection() throws ClassNotFoundException, SQLException {
	//1. 드라이버 로딩 

	//드라이버를쓰는이유 (jar파일로되어ㅣ있는거)-디비도 회사나 종류가 많음. 어느 디비로 연결해도 연결이가능하도록(중간에 다른회사껄 써도 갈아끼울수있도록) 내가 쓰려고하는회사의 드라이버를 사용해서연결해줘야함.
	//각회사마다 드라이버를 파일로 제공함

	//파일연결해주고 내가 그파일을 사용하겠다는 코드작성

Class.forName(driverName); 

//예외처리를해줘서 문법적오류가아닌 오타적오류는 실행중에 알수있어서 실행중오류라부르는데 그걸 잡아줌 - 오류가날거같은 구문들을 try안에 넣어주고 catch에 어떤예외가들어갈건지 적어주기


	

// 2. 데이터베이스 접속

Connection conn = DriverManager.getConnection(url,id,pw);  //접속이라는거 자체도 객체로 관리하기 
	return conn;
}
	
	
	
	
	
}
