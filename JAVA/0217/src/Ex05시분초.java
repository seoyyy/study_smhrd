import java.util.Scanner;

public class Ex05시분초 {

	public static void main(String[] args) {
	
		//1.스캐너 임포트
		
		Scanner sc = new Scanner(System.in);
		
		//2.출력문 "초 입력: "
		System.out.print("초 입력 : ");
		
		//3.정수입력받기!

		int num1 = sc.nextInt();
		
		//4.입력받은 정수를 시,분,초 출력하면됩니다
		//ex) 1시간은 3600초, 60분
		int hour = num1 / 3600;
		int min = num1 % 3600/60;
		int sec = num1 % 3600 % 60;
				
		System.out.print( hour + "시 " + min + "분 " + sec + "초");
		
		
		
	}

}
