package 메소드;

public class Ex02메소드2 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		// op에 담긴 값에 따라 계산이 다르게 나오면됨!
		
//		int result = 0;
//		
//		if(op == '+') {
//			result = num1 + num2;
//		}else if(op == '-'){
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
				//이걸 메소드 기능안에 넣어보기 
		
		
		//만들어논 메소드 호출하기
		System.out.println(cal(num1,num2,op));
		
		

	}
	
	public static int cal(int num1, int num2, char op) {
		int result = 0;   //int reuslt라는 변수에 일단 0을 넣어서 선언하고 값을 변경해 나갈거
		
		//op안에 있는 값에 따라 다른 사칙연산을 적용시켜주세요 !
//		if(op == '+') { //char는 문자열 string이아니고 문자 자체여서 .equals가아니고 숫자연산비교처럼 ==을 사용.
//			result = num1 + num2;
//		}else if(op == '-'){
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
//		return result;
		
		switch (op) {
		case '-':
			result =  num1 - num2;
		break;
		case '+':result =  num1 + num2;
		break;
		case '*':result =  num1 * num2;
		break;
		case '/':result =  num1 / num2;
		break;
				}
		return  result;
		
		
		}
		
		
					}
	
	

