import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	//DTO ; data transfer object 데이터 전송
	//DAO ; 
	
	//1.DB연결 -conn()
	//2.SQL 실행
	//3. close() 꼭해줘야함 -> 다른반과 동시에 연결하닌까 
	//연결하고 클로즈하는건 다 필요하닌까 아예 메소드로 만들어버릴거
	
	Connection conn = null ;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public void conn() {  //연결할땐 conn만불러와서 사용
	       try {
	           Class.forName("oracle.jdbc.driver.OracleDriver");

	            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	            String dbid = "system";
	            String dbpw = "12345";

	            conn = DriverManager.getConnection(url, dbid, dbpw);
	      } catch (Exception e) {
	         e.printStackTrace();}
	      }
	       
	       public void close() {
	           try {
	        	   
	        	   if(rs!=null) {
	        		   rs.close();
	        	   }
	        	   if(pst!=null) {
	        		   pst.close();}
	        	   
	           		if(conn!=null) {
	           			conn.close();
	           		}
	           		
	        	   	rs.close();	//만들어준거 역순으로 닫아주기 
	                  pst.close();
	                  conn.close();
	       }
	                catch (Exception e) {
	                  e.printStackTrace();
	               }
	       
	       
	    }
			
	
}
