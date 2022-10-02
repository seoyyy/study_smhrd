import java.util.Scanner;

public class Ex04for문예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 2개를 입력받아 두수 사이의 총 합을 출력하는 프로그램을 작성하시오
		//첫번째 입력값 작은수, 두번째값 큰수
		System.out.print("시작 값 : ");
		int num1 = sc.nextInt();
		System.out.print("끝 값 : ");
		int num2 = sc.nextInt();
		
		int total = 0; //->누적할땐 반복문 밖에서 변수선언해서 초ㄱㅣ화되지않도록
	
		
	for(int i = num1; i<=num2; i++ ){
		 	total += i;
		}
	System.out.println("총합 : " + total); //->출력은 한번만이라 반복문끝나고

	}

}
