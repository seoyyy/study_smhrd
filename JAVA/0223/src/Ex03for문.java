import java.util.Scanner;

public class Ex03for문 {
		//스캐너 임포트
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//값 두개 입력받기
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//조건이 필요!
		//ex) num1>num2일때는 num2가 시작하는 값/ num1이 끝나는 값
		//ex) num1<num2일때는 num1이 시작하는 값/ num2가 끝나는 값
		//조건문 속에 반복문 2개를 작성해서 풀이가능 !
		if(num1>num2) {
			for(int i1 = num2; i1<=num1;i1++) {
				System.out.print(i1 + " ");
			}			
		}else if(num1<num2) {
			for(int i2= num1; i2<=num2; i2++) {
				System.out.print(i2 + " ");
			}
		}
		
		//다 푼 경우 삼항연산자로 활용해서 반복문 하나로 줄일수있음.
		//조건문 ? 참 : 거짓 ;
		 	int big = (num1 > num2) ? num1 : num2;
			int small = (num2 > num1) ? num1 : num2;
			for(int i = small; i <= big; i++) {
				System.out.print(i);
			}
		

	}

}
