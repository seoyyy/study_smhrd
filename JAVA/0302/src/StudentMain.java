
public class StudentMain {

	public static void main(String[] args) {
		
	
//	Student seoyoung;
	//내가만든클래스가 자료형이 됨 -> int나 String처럼
	//그 자료형을 사용하기 위해 변수 선언해서 저장이필요.
	
	//seoyoung이름을가진 변수의 데이터타입은 Student
	//student 클래스에 맞는 데이터를 저 변수에 넣어줄수있음
	
	//int형 데이터에 변수저장하고 숫자5를 넣어주는 것처럼 
		//Student라는 데이터형식을 가진 seoyoung변수에 
		//사용자가 임의로 지정한 student클래스에 맞는 크기의 데이터를 넣어줄게요->new 라는 키워드사용
	Student st1 = new Student(); //new => 공간을 만들어줄게요(할당해줄거에요)
	//Student() -->생성자
	//그 해당하는 공간에 Student클래스타입만큼의 공간을 만들어서 해당하는 데이터를 seoyoung이라는 변수에 담아줄게요

	//여기까지가 객체생성 -> 이제서야 실질적으로 seoyoung이라는 student클래스에 있는 기능및정보들이 들어간것.
	//-> 클래스에 있는 데이터와 기능을 사용할 수 있다.!
	//->인스턴스 라고도불림
	
	//여기까지하면 안에 내용은 비어있음 -> 이 칸에 이 내용을 넣어줘~ 이 데이터를 저장시켜줘
	st1.name = "서영";
	st1.number ="123456";
	st1.age = 26;
	st1.scoreJava = 80;
	st1.scoreWeb = 80;
	st1.scoreAndroid = 80;
	
	//이제 그 데이터들 불러올수 있음
	
	System.out.println("이름:" + st1.name );
	System.out.println("학번:" + st1.number );
	System.out.println("나이:" + st1.age );
	System.out.println("자바점수:" + st1.scoreJava );
	System.out.println("웹점수:" + st1.scoreWeb );
	System.out.println("안드로이드점수:" + st1.scoreAndroid );
	
	
	Student st2 = new Student();
	st2.name = "형쌤";
	st2.number = "20210307";
	st2.age = 21;
	st2.scoreJava = 90;
	st2.scoreWeb =100;
	st2.scoreAndroid = 80;
	
	
	System.out.println("형쌤평균:"+st2.studentAvg());
	  //->클래스에있던 기능 불러오기
	System.out.println("서영평균 : "+st1.studentAvg());
	

	//st1과 st2의 점수 평균을 알고 싶어요
	//->평균구하는 기능 만들어주기(메소드로 만들어주면됨)
	//여기에 하는건 비효율적! student클래스에 기능을 만들어주기 
	
//	System.out.println("학생1평균 :" + avg(st1.scoreJava,st1.scoreWeb, st1.scoreAndroid));

	}
//	public static int avg(int java, int web, int android) {
//		int result = (java + web+android)/3;
//		return result;
	}


