import java.util.Scanner;

public class Ex06배열예제3 {

	public static void main(String[] args) {
	//1.스캐너 임포트	
	Scanner sc = new Scanner(System.in);
	//2. 10칸짜리 인트형 배열생성 - 공간만생성
	int[]arr = new int[10];
	
	//3.총 10번 동안 사용자에게 숫자(정수)입력
	//3-1. 10칸짜리 배열에 데이터를 차곡차곡 저장
	for(int i =0; i <10; i++) {   //->인덱스번호를 기준으로해주기 그게더 중요
		System.out.print((i+1)+"번째 정수 입력 : ");
		arr[i] = sc.nextInt();	
	}
	//4. 3의 배수 출력 : 출력문 제공
	System.out.print("3의 배수 출력 : ");
	
	//5. 배열 속에 3의 배수들만 옆으로 출력! print
	 	for(int j = 0; j <arr.length; j++) {
	 		if(arr[j]%3==0) {
	 			System.out.print(arr[j] + " ");
	 		}	 		
		
	 	}
		
		

	}

}
