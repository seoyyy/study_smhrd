package 메소드;

public class Ex01메소드1 {

	public static void main(String[] args) {
		
	int num1 = 10;
	int num2 = 20;
	
	int result = add(num1,num2);		//밑에서 만들어논 add라는 메소드를 불러옴-> 호출 하여 메소드의 내용을 수행
	System.out.println("결과 : " + result);
	
	//minus 기능 사용하고싶어요
	//메소드 이름으로 호출 : 메소드를 사용할꺼에요!

	//주의 !! 변수 자체를 메소드로 넘겨주는게 아니라 변수 안에 있는 값!만 넘겨준다.
	int result2 = minus(num1,num2);
	System.out.println("결과 : " + result2);
	
	int result3 = mul(num1,num2);
	System.out.println("결과 : " + result3);
	
	int result4 = div(num1,num2);
	System.out.println("결과 : " + result4);
	
	
// 원래 이 기능을 매번 적어주지 않고 main 아래에 메소드로 넣어서 자주 쓸때마다 불러오도록하는게 메소드	
//	 int result = num1 + num2;
//	
//	int num1 = 34;
//	int num2 = 40
//			System.out.println("결과 : " + result);
	
	}
	
	//메소드 : 자주 사용하는 기능을 따로 빼놔 정래해놓은것 !!!을 의미
	//필요할때마다 불러와서 사용하자!
	//public : 접근 제한자 --> 이 메소드를 어디까지 사용범위를 허용할 것인가? 를의미
	//public은 전부 사용해도좋아요 
	//static : 공유하다! 위에 main쪽이 ㅣㅇ쪽을 공유하도록
	//int :리턴 타입(반환타입)
	//add(int num1, int num2) : 메소드 이름(필요재료,필요재료 int타입 변수를 두개받을거야)
	//{메소드 실행 로직(더한다)
	// return result;  --> 해당하는 이 result라는 데이터를 반환할거에요!  ★★★★★중요!! 
	//						(위에서 약속한 리턴 타입에 맞게 데이터를 반환해줘야한다.)
	// }
	
	public static int add(int num1, int num2) {
		int result = num1 +num2;
		return result;  //->호출된 위치는 위에서 add를 호출했던 그 위치로 들어가게됨.
	}
	//빼기 기능을 하는 minus 라는 메소드를 만들꺼에요!
	public static int minus(int num1, int num2) {
		int result = num1 -num2;
		return result;
	}
	//곱하기 기능을 하는 mul이라는 메소드
	
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//나눈 몫을 구하는 div라는 메소드
	public static int div(int num1, int num2) {
		int result = num1 /num2;
		return result;
	}
	
	
	
}
