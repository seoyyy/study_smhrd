import java.util.Scanner;

public class Ex02다이어트반복문 {

	public static void main(String[] args) {
		
		//1.스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		
		
		//2.현재몸무게 출력문제공
		//2-1. 현재몸무게 입력
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		//3.목표몸무게 출력문 제공
		//3-1.목표몸무게 입력
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		//4. 반복문을 
		//n주차(->1씩증가하는 변수사용) 감량 몸무게 출력문제공
		//몸무게를 입력
		int week = 1;
		int weight = 0;
		while(true) {
			System.out.print( week + "주차 감량 몸무게 : ");
			weight = sc.nextInt();
			week++;
			//현재 몸무게를 출력하는 문장작성 (현재몸무게 - 감량몸무게) ->누적이되면서 빼줄수있게 복합대입연산자사용
			System.out.println("현재 몸무게 : " + (now-=weight));
			//멈추는 조건주기
			if(now<=goal){
				System.out.println("축하합니다!");
				break;
			}			
		} 

	}

}
