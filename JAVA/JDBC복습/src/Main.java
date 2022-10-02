import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DAO dao = new DAO();					//-DAO에있던(다른클래스에있던) 메소드를 불러오기위해 객체생성해준거
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.조회 2. 입력");
		
		int menu = sc.nextInt();
		
		if(menu == 1) {
		}else if(menu==2) {
			//DAO 메서드만 호출
			//DAO클래스에있는 insert만 불러올거에요 -> 다른클래스에있는 메소드를 불러오는건 항상 객체를 생성해준다음 사용해야함
			
			String type = sc.next();
			int level = sc.nextInt();
			String name = sc.next();
			dao.insert(type , level, name);	//dao의insert를 호출하겟다. 
			
			//만약 여기서 반환할게 있다 하면은
			// boolean result = dao.insert(type,level,name); 이렇게 반환값을가지고오면되고
			//만약 여기서 출력할게 있다 하면은
			//if( result == true){
			//System.out.println("성공!");
			//}else{syso"실패!"}			이런식으로해주기
			
			//나머지 sql도 똑같음 select하고시으면 conn부분만 빼고 catch전까지만 해주면됨. 그안에 sql문select로하고
			
		}
		

		//DTO(Data Transfer Object) - 데이터를 전송하기위해서 사용하는 객체
		//피카츄(타입-String, 레벨-int, 이름-String) 이렇게 데이테가 여러개일때 하나로 묶어서 가지고 돌아다녀야 
		//하나의 피카추에 대한 정보를 여기서도 저기서도 불러 사용할 수 있음.
		//그걸 정의할때 사용했던 설계하는 클래스를 DTO라고 부름=>DTO클래스 
		//한 객체에 대한 정의만 해주는것. 그리곱 보통 이안에 메소드를 넣을때는 우리가 필요한 생성자. 이객체를 생성하기위한 생성자
		//그다음에 이필드값들을 설정하기 위한 set메소드, 가져오기위한 get메소드 이정도만 보통 들어있음.
		
		//DAO(Data Access Object) - 접근하기 위한것
		//JDBC코드(DB랑 연결해주는 connection, 닫아주는 close , insert나select실행하는거)요론 코드들을 작성을해서
		//데이터베이스에 접근을 할수있도록 만들어주는 객체 
		
		//이렇게 두가지가 있으면 Main 클래스에서는 만들어논 dto나 dao를 호출만 해주면 쓸수 있음.
		
//		정수형 하나 int, 문자열 하나만전송 string 이때는 DTO가 좋음. 그런데 여러타입의 데이터들 넣어줄때는 배열이나 어레이배열로
//		들어갈수 없음. 배열이나 어레이배열은 같은 타입으로만 들어갈 수 있음
//		타입이 다양하다면 같은 배열에 넣을 수 없어서 사용자정의자료형을 만들어줘야함. 
//		여러개의 형태의 데이터들을 하나로 묶어주는 클래스를 설계 => 클래스 & 객체 
//		DTO라는 건 보통 내가 담을 데이터들을 필드로 정리해놈
		
		
	}

}
