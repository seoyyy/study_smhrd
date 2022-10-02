import java.util.Scanner;

public class Ex02스위치계절 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월(1~12) 입력 : ");
		int season = sc.nextInt();
		
		//->하드코딩 방식 (내가한코딩)
//		switch(season) {
//		case 1:
//			System.out.println(season + "월은 겨울입니다");
//			break;
//		case 2:
//			System.out.println(season + "월은 겨울입니다");
//			break;
//		case 12:
//			System.out.println(season + "월은 겨울입니다");
//			break;
//		case 3:
//			System.out.println(season + "월은 봄입니다");
//			break;
//		case 4:
//			System.out.println(season + "월은 봄입니다");
//			break;
//		case 5:
//			System.out.println(season + "월은 봄입니다");
//			break;
//		case 6:
//			System.out.println(season + "월은 여름입니다");
//			break;
//		case 7:
//			System.out.println(season + "월은 여름입니다");
//			break;
//		case 8:
//			System.out.println(season + "월은 여름입니다");
//			break;
//		case 9:
//			System.out.println(season + "월은 가을입니다");
//			break;
//		case 10:
//			System.out.println(season + "월은 가을입니다");
//			break;
//		case 11:
//			System.out.println(season + "월은 가을입니다");
//			break;
//			
			
		//좀더 효율적인 코딩방식
		// case 1:
		//	case 2: 이렇게 브레이크를 안걸고 
		// s y s o 해서 출력해줘도 가능
		switch(season) {
		case 12,1,2:
			System.out.println(season + "월은 겨울입니다");
			break;
		case 3,4,5:
			System.out.println(season + "월은 봄입니다");
			break;
		case 6,7,8:
			System.out.println(season + "월은 여름입니다");
			break;
		case 9,10,11:
			System.out.println(season + "월은 가을입니다");
			break;
		}
		
		
		}
		
		
		

	}


