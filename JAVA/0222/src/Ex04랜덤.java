import java.util.Random;
import java.util.Scanner;

public class Ex04랜덤 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int suc = 0;  //->누적이나 저장하는 변수는while문 밖에 놓기 안그러면 반복될때마다 초기화됨
		int fail = 0;  //->틀린개수저장변수
		
		//반복문을 통해서
		//값이 정확한경우에는 success출력
		//틀린경우는 fail 출력
		
		while(true) {
			//1.랜덤숫자 뽑는 방법(스캐너불러오는기능과 비슷)
			Random rd = new Random();
		int num1 = rd.nextInt(10)+1;  //->10개 랜덤이면 숫자가 0부터시작해서 10개라 9까지 나오니 거기에 +1을해줘서 1부터시작하도록해주기
		int num2 = rd.nextInt(10)+1;	
		
		System.out.print(num1 + "+"+ num2 + "=");  // ->랜덤문제 출력문
		int input = sc.nextInt();
		
		if(input == num1+num2) {
			System.out.println("Success!");
			suc++;
			
		}else {
			System.out.println("Fail!");
			fail++;
		}
			
		System.out.print("계속하시겠습니까?");
		String answer = sc.next();
		
		if (answer.equals("Y")) {
			continue;
		}else if(answer.equals("N")) {
			System.out.println("종료!");
			System.out.println("맞춘개수 : " + suc);
			System.out.println("틀린개수 : " + fail);
			break;
		}
		
		}
		
		
	}

}
