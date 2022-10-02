package View;

import java.util.Scanner;
import Controller.DTO;
import Controller.Picture;


public class Main {
	//이용자가 볼수있는 화면만

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DTO dto = new DTO();
		Picture pic = new Picture();
		String id = null;
		
		while (true) {
			pic.picBurger();
			System.out.print(" [1]로그인 [2]회원가입 ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("아이디 입력 : ");
				id = sc.next(); 		//player테이블 변수
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next(); 	//player테이블 변수
				int res = dto.checkID(id, pw);

				if (res == 1) {
					System.out.println("로그인 성공!");
					break;
					// 게임접속!!!!!!!
				} else {
					System.out.println("로그인 실패!");
				}

			} else if (choice == 2) {

				System.out.println("가입 아이디 : ");
				String new_id = sc.next();
				System.out.println("가입 비밀번호 : ");
				String pw = sc.next();

				int cnt = dto.insert(new_id, pw);

				if (cnt > 0) {
					System.out.println("회원가입 성공!");
				}

			}

		}

		while (true) {
			System.out.println("[1]게임시작 [2]랭킹확인 [3] 종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("게임시작");

				while (true) {
					dto.game(id);
					System.out.println("[1]게임재개 [2]게임종료");

					int want = sc.nextInt();
					if (want == 1) {
						continue;
					} else if (want == 2) {
						System.out.println("종료되었습니다");
						break;
					}
				}
			} else if (choice == 2) {
				System.out.println("랭킹 확인");
				dto.rank();
			} else if (choice == 3) {
				System.out.println("종료되었습니다");
				System.exit(0);
				//break;
			}

//		System.out.println("게임을 종료합니다.");
//		System.exit(0);

		}
	}
}

