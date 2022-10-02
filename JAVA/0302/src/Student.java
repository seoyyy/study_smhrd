
public class Student {

//class = 템플릿으로 단지 틀일뿐 , object = 템플릿을 이용해 실제로 데이터를 넣어서 만드는것이 오브젝트	
	//사물이 가지는 필드(속성) 과 메소드(기능)을 묶어둔 하나의 자료형
	// 자료 + 기능을 넣어논 사용자가 만든 자료형 ->int나 String처럼
	// 현실의 객체를 표현하기 위한 방법(설계도)
	// 클래스를 만들기 위해서는 추상화, 캡슐화 라는 작업을 통해 만들어진다. 
	
	
	//학생의 정보를 담을 수 있는 student클래스를 작성하세요.
	//student클래스는 다음과 같은 필드를 갖습니다. ->필드 속성
	
	String name = "한서영";  //이름
	String number= "12345";	//학번
	int age = 26;	//나이
	int scoreJava = 80;//Java점수
	int scoreWeb = 80;	//Web점수
	int scoreAndroid= 80;	//Android점수
	
	//평균 구하는 기능
	//메인에서 메소드할때는 변수옆에 매개변수를 적어줬어야하는데 클래스에서 기능을 넣을때는 매개변수 받을 필요 없음
	//매개변수를 받아주지않아도같은 괄호안에잇어서 지역변수가 아니라 그냥 사용할수 있음->전역변수임 전체적으로인지할수있는
	public int studentAvg() {
		int result = ( scoreJava + scoreWeb + scoreAndroid)/3;
		return result;
	};
	
	//출력까지 같이 해주고싶으면 반환할필요없으니 반환안할거에요키워드 void 넣어주고 return안해줘도됨 그리고 출력문 추가해주기
	//그리고 메인에서 그냥 출력문안넣고 불러오기만해도 출력이 됨.
	
}
