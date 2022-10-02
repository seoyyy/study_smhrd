import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	//1.DB연결 - conn()
	//2.SQL실행부분 
	//3.close() --> 같은디비에 여러명이 접속해서 데이터를 열어주니 사용하고 꼭 닫아줘야함.
		//모든기능들에는 연결하고 마지막엔 닫아주고 이작업이 꼭들어가니 이 부분을 그냥 메소드로 만들어서 필요할때마다 불러쓸거야.
	
	
	//변수선언자리(전역변수로빼서 선언해놓는거)
	Connection conn = null;		//1!  //임포트필요
	PreparedStatement pst = null; //임포트필요
	ResultSet rs = null;  //-> select문 쓸때 쓸거임
	// 이 세개 객체들은 기능을 호출했을때 생성이될 객체들임  우리가생성한 객체들말고 시스템에서사용하는객체들은 해비해서 애들은 다 사용하고나면은 종료해주기
	
	//connection메소드 만들어놓기(연결할때 항상쓰는코드) (url이나 id같은건 우리한테맞게 수정해서 쓰면됨)
	//그래서 앞으로 연결할때 이 conn()메소드만 호출해서 쓰면됨
	public void conn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "smart_a_0310_4";
			String dbpw = "smhrd4";
		
			
				conn = DriverManager.getConnection(url, dbid, dbpw);  //1! //DriverManager 임포트필요
			
		} catch (Exception e) {
			e.printStackTrace();
	}
				
	}
	//close메소드 --> finally 마지막쯤에 항상 close 메소드 만들어주기 
	public void close() {
		
		try {
			//-> 생성됬던(만들었던) 순서의 역순으로 닫아주기
			
			//resultset은 select할때만쓰지만 이 close라는 메소드는 모든 메소드에서 다 호출해서 쓸거임
			//insert할때도 update할때도 ! 그럼 insert랑 update할때는 resultSet안쓰닌까
			//이문장도 작성해줘야함(resultSet이 없을때는 안쓰도록!)
			if(rs != null) {			//생성이안됬으면 null값으로 초기화시켜놨기때문에 null값을 가지고있을거임
				rs.close();						//그래서 null이 아닐때만 닫을 수 있도록
			}
			
			if(pst != null) {		//얘네들은 다 쓰긴하지만 혹시 안쓰여서 생성이안됬다면
				pst.close();		//close메소드를 호출할 수없음 (객체 자체가 없으면 호출 할수없음)
			}						//그래서 다들 이렇게 조건문 써서 닫아주면 훨씬 좋음 오류줄일수 있다.
			if(conn != null) {
			conn.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	

	
	// 애네를 호출하는 실제기능을 작성
	
	//insert하는거 먼저작성 - 메소드 이름이 insert일때 
	//insert문에서 가장중요한건 insert문을 실제로 실행을했을때 데이터가 들어가는게 중요함
	//만약 들어갔을때 성공했습니다 출력해서 성공했는지 실패했는지 판별하고싶을때 반환을 하는거지 -int		//출력을할때는 콘솔창에 뜨는건 사용자들이 보는거닌까 눈에 보이는걸 할때는 Model단에 넣어주는게 좋음
	//void나 이런건 자기가 원하는걸로! insert만해도되면 void해도됨.								//(눈에보이는건 view단에서!) -개발중에 확인을하고싶을땐controller에해도 상관 ㄴㄴ(계발끝나고는 빼야함)
	public void insert( String type, int level, String name) {
		
		try {
		//가장먼저해야하는게 연결하는거 ! 연결하는기능만들어놨으니 여기선 호출만하면됨
		conn();
		
		//이제 나머지에서는 sql문 정의하고 실행(pst)만시켜주면됨
		String sql = "insert into poketmon values(?, ?, ?)";
		
		pst = conn.prepareStatement(sql); 	
		//넣을때는 맞춰서 넣어주기( 첫번째자리에는 타입넣고 두번째자리는 레벨넣어주세요~(인덱스번호임)
		pst.setString(1, type);
		pst.setInt(2, level);
		pst.setString(3,name);
		
		//삽입을할때는 update라는걸 사용할거임
		int cnt = pst.executeUpdate();  //->insert,update,delete하면 executeUpdate 메소드사용하는데 얘를 쓰면 int형이 반환됨
			//삽입이됬는지안됬는지 알고싶으면 cnt 얘를 통해서 알수있는거임. 애를 넘겨줘서 출력할수잇음.
		
			//cnt값이 1일때는 true로 성공한거, 0일때는 false로 실패한거
		//위에 bloolean result = false; 로 초기화값 선언해주고
//			if(cnt>0) {
//				result = true;
//			}else {
//				result = false;
//			}					이런식으로 확인가능
		
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close();		//무조건 마지막엔 finally로 close(); 해주기!
		}					//값 리턴하고싶을땐 무조건 close 해주고 그다음에 return해주기 안그럼 close되기전에 return하고 다 종료시켜버림
			//return result;
	}
	
	//이제 이것들을 메인에가서 쓸때 호출만해주면됨!!
}
