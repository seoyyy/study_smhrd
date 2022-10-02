import java.util.Scanner;

public class Ex09_if_else예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받아 1의 자리가 5보다 크거나 같다면 올림
		//1의 자리가 5보다 작다면 내림한 결과를 출력하시오.
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%10>=5 ) {
			System.out.println("반올림 수 : " + (num - num % 10 + 10) );
		}else {
			System.out.println("반올림 수 : " + (num-num%10));
		}
		
		
		
		
		
		
	}

}
