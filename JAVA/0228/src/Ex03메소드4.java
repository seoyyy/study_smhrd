
public class Ex03메소드4 {

	public static void main(String[] args) {
		//2개의 정수를 받아 2개의 숫자 중 10에 더 가까운 수를 반환하는 메소드 close10을 만들어보세요.
		
		int num1 =11;
		int num2 = 5;
		int result = close10(num1,num2);
		System.out.println("10에 가까운 수 : " + result);
	
		
		
		
		
		
	}
	public static int close10(int num1, int num2) {
		int result = 0;
		
		int dNum2 =10-num2; //-> 절댓값을 나타내는 변수(거리) (일방적으로 num1과 num2를 비교하는게 아니라 10과의 거리를 알아야함!)
		int dNum1 = 10-num1;		//거리가 되려면 양수여야함
		
		
		if(dNum2<0) {		//-> 만약에 거리값이 -면 -1을 곱해줘서 양수로 만들어주는 if문 (차이를 거리로만들어주는 조건들)
			dNum2 = -1*dNum2;
		}
		
		if(dNum1<0) {
			dNum1 = -1*dNum1;
		}
		//각각 거리에맞는 절댓값이 들어가게됨!
		
		
		if(dNum1>dNum2) {		//거리값을 구한걸로 둘중 더 작은수가 10에 가까운거라고 지정하는 if문
			result = num2;
		}else if(dNum1<dNum2) {
			result = num1;
		}
		return result;
	}

}
