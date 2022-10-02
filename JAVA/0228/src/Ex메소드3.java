
public class Ex메소드3 {

	public static void main(String[] args) {
		
	//두개의 양수를 받아 2개의 숫자 중 더 큰술르 반환시켜주는 메소드 lagerNumber 만들어보기
		// 만약 두숫자가 같다면 0을 반환
		
	int num1 = 24;
	int num2 = 24;
	
	int result = lagerNumber(num1,num2); //어떤수가 더큰지 result라는 변수에 담아주겠다(저장),뭐가더큰지판별은 메소드가! 그 메소드 호출
	System.out.println("큰 수 확인 : " + result); 
		
		
		
		
		
		
	}
	public static int lagerNumber(int num1, int num2) {
		
		int result = 0; //이 result변수에 데이터를 담아서 반환시켜줄거 //그리고 0으로 지정해놔서 두수가 같을댄 저if에 해당안되서 0이 그대로 출력
		
		if(num1>num2) {
			result = num1;
		}else if (num1<num2) {
			result = num2;}
//		else {
//			result = 0;
//		}
//		
	//삼항연산자 이용해도 ㅇㅇ
		
		
		return result;
		
	}

}
