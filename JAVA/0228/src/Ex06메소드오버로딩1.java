
public class Ex06메소드오버로딩1 {

	public static void main(String[] args) {
		
	int num1 = 10;
	int num2 = 20;
	
		System.out.println("결과1 : "+ add(num1,num2));
		
		double num3 = 10.5;
		double num4 = 21.7;
		System.out.println("결과2 :" + add(num3,num4));
		
		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("결과3 : "+ add(num5,num6));
		
		
		
		
	}
	//메소드 오버로딩 : 같은 메소드 이름으로 여러개의 매개변수 타입을 다르게 해서 다른 기능을 수행시키는것.
	//메소드 오버로딩 조건 
	//1.메소드 이름이 같아야함. 2.매개변수의 개수 또는 타입이 달라야함. 3.매개변수는 같고 리턴ㄴ타입이 다른 경우는 오버로딩이아님.
	
	
	// num1과 num2를 더해서 반환시켜주는 add라는 메소드 만들어 주세요 !
	public static int add(int num1, int num2) {
		
//		int result = num1 + num2;
		
		return num1+num2;
					
	}
	//num3와 num4를 더한 값을 반환해주는 메소드 만들어주세요.
	public static double add(double num3, double num4) {
		return num3+num4;
	}
	
	public static float add(float num5, float num6) {
		return num5+num6;
	}
}
