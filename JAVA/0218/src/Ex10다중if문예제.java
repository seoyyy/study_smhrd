import java.util.Scanner;

public class Ex10다중if문예제 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점입니다.");
		}else if(grade >= 80) {
			System.out.println("B학점입니다.");
		}else if(grade >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("휴학");
		}
		
		
		
	}

}
