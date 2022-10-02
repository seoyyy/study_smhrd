
public class Ex04메소드5 {

	public static void main(String[] args) {
		
	//2개의 정수 base,n을 받아 base의 n제곱 만큼 값을 반환하는 powerN()메소드를 작성하세요.
		
		int base = 2;
		int n = 3;
		 powerN(base,n);
		//int result 
		
		
		

	}
	public static void powerN(int base, int n) {  // void 리턴을 시켜주지 않을때는 반환타입위치에 void라는 키워드 사용
		int result = 1;  //0으로 초기화해노며 ㄴ값이 누적이 안댐.
		
		//누적 곱 구하기 !
		for(int i = 1; i < n+1; i++) {
		result *= base;		// base를 i(n)번 반복해서 곱해라 (result에 베이스가 n번까지 곱해질테닌까_) 이 로직안에서 i는 사용하지 않는다.
		//result = result * base
		}
		
		
		
		System.out.println("결과 확인 : " + result);
//		return result;
	}
}
