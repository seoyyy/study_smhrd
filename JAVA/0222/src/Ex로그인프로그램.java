import java.util.Scanner;

public class Ex로그인프로그램 {

	public static void main(String[] args) {
		//1.스캐너 임포트
		Scanner sc = new Scanner(System.in);
		//2.반복작업을 통해서 
		//2-1 아이디입력이라는 출력문 
		//2-2 아이디를 입력하는 입력문
		//2-3 비밀번호 입력이라는 출력
		//2-4 비밀번호 입력하는 입력
		
		int cnt = 1;
		
		while(true) {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		//3. 조건!
		//3-1 아이디가 smhrd이면서 비밀번호가 1234인경우에는
		//3-2 로그인 성공이라고 출력
		//3-3 하나라도 틀리게된다면 
		//3-4 로그인 실패라고 출력
		
		if(id.equals("smhrd") && password.equals("12345")) {
			System.out.println("로그인 성공");
			break;
			
		}else {
			System.out.println("로그인 실패");
			System.out.print("계속 하시겠습니까?");
			String answer = sc.nextLine();
				if(answer.equals("N")) {
					break;
				}else if(answer.equals("Y")) {
					if(cnt>=3) {
						System.out.println("본인인증을 진행하세요");
						break;
					}
					cnt++;  //->로그인실패하고 다시시도할때 횟수제한위해 카운트해주는명령
					
				}
		}
		
		
		}
			

	}

}
