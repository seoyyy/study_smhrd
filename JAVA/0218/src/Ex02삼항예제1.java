import java.util.Scanner;

public class Ex02삼항예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//정수를 입력받아 홀수인지 짝수인지 판별하세요.
		//1.정수를 입력하라고 출력문을 제공
		System.out.print("정수를 입력하세요 : ");
			
		//2.사용자에게 정수를 입력받기
		int num = sc.nextInt();
		
		//3.(입력한 숫자가 2로 나눴을때 나머지가 0이면) 짝수! 아니면 홀수!
		
		String result = (num%2 == 0) ? "짝수" : "홀수";
		
		//4.내가 입력한 숫자는 + 은(는) + (짝수,홀수) +입니다.
		
		System.out.println("내가 입력한 숫자는 " + num + "은(는) " + result + "입니다.");

	}

}
