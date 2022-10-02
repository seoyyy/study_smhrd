import java.util.Scanner;

public class Ex03삼항예제2 {

	public static void main(String[] args) {
		
		//1.스캐너 호출
	Scanner sc = new Scanner(System.in);
	
	//2.출력문을 통해서 첫번째 정수를 입력
	//2-1. 첫번째 정수를입력
	System.out.print("첫번째 정수 입력 : ");
	int num1 = sc.nextInt();
	
	
	//3. 출력문을 통해서 두번째 정수를 입력하세요!
	//3-1. 두번째 정수를 입력
	System.out.print("두번째 정수 입력 : ");
	int num2 = sc.nextInt();
	
	//4.입력한숫자중 큰숫자에서 작은숫자를 뺀 결과를 도출
	
	int res = (num1 > num2) ?  num1-num2 : num2-num1 ;
	
	//5.뺀 결과를 출력
	
		System.out.print("두 수의 차 : " + res);	

	}

}
