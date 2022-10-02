import java.util.Scanner;

public class Ex08조건문예제3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		
		System.out.print("Python 점수 입력 : ");
		int python = sc.nextInt();
		
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		
		if((java+python+android)/3>=80) {
			System.out.println("합격");
		}

	}

}
