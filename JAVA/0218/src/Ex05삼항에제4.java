import java.util.Scanner;

public class Ex05삼항에제4 {


	public static void main(String[] args) {
		//1.스캐너 임포트
		Scanner sc = new Scanner(System.in);
		//2.노동시간을 입력하라는 출력문
		System.out.print("노동시간을 입력하세요 : ");
		//3.노동시간을 입력
		int hour = sc.nextInt();
		
		//4.8시간까지는 9000원의 기본시급을 받고, 8시간 부터는 1시간마다 1.5배의 수당받기
//		
//		int pay = (hour<=8) ? (hour*9000) : (int)(8*9000+(hour-8)*9000*1.5);
//		
//		System.out.println("총 임금은 " + pay + "원 입니다.");
		
		//if~else 문으로 이용해서 풀어주세요
		
		if(hour>8) {
			System.out.println("결과 값 : " + ((int)(8*9000+(hour-8)*9000*1.5)));
		}else {
			System.out.println("결과 값 : " + hour*9000);
		}
			

		
		
	}

}
