package Question7;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.println("====뮤직 플레이어====");
		System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >>");
		int choose = sc.nextInt();
		
		if(choose < 1 || choose >6) {
			System.out.println("정확한 숫자를 입력해주세요.");
		}
		
		if(choose == 1) {
			System.out.println("====등록====");
			System.out.println("제목  : ");
			String new_title = sc.next();
			System.out.println("가수  : ");
			String new_singer = sc.next();
			System.out.println("시간  : ");
			int new_playTime = sc.nextInt();
			
		
			
		}
		
		if(choose == 6) {
			System.out.println("종료합니다");
			break;
		}
		
		
		
		}
	}

}
