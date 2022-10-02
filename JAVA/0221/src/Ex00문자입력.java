import java.util.Scanner;

public class Ex00문자입력 {

	public static void main(String[] args) {
		
		// .next() vs .nextLine()
		//next는 /t,/n 엔터, 스페이스가 들어가면 그 기준으로 문자가 잘려서 출력
		// nextLine /t,/t 스페이스도 인식
		
		
		Scanner sc = new Scanner(System.in);
		
//		String txt = sc.next();
//		System.out.println(txt);
		//안녕 안녕 => 안녕
		
		String txt2 = sc.nextLine();
		System.out.println(txt2);
		//안녕 안녕 => 안녕 안녕

	}

}
