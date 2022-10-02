import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		
		// 정수 1개를 입력받아 1부터 입력받은 정수까지 차례대로 출력해주는 프로그램을 작성.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			System.out.print(i + " ");
		}
		
		

	}

}
