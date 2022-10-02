import java.util.Scanner;

public class Ex04while예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int total = 0; 		//->덧셈을 기억해줄 공간이 필요 (num값들을 누적해서 저장시켜주는 변수)
		
		
//		while(num!=-1) {   			//-> -1이아닌경우에 반복해주세요
//			total += num;		//-> -1도포함이되는걸 막기위해 코드 순서가 중요 ㅇㅒ를 맨위로 올려줌
//			System.out.println("숫자 입력 : ");
//			num = sc.nextInt();
//			//total = num+total;
//	
//		} 
		
		//메모장 켜서 코딩 해석하며 하는게 손코딩 ->디버깅?잡는거?
		//true조건 넣어서 돌려보기
		
		while(true){
			total += num;		
			//-> break가없을때는 반목문을 빠져나올수없어서 무조건 다시 위로 올라가서 total += num의 위치가 중요했지만 
			// break가 있으면 빠져나올수있는 장치라서 total += num의 위치가 중요하지 않음.
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if (num ==-1) {
			break;
				}
		}
	
		System.out.println("누적된 결과는 " + total);
		
		

	}

}
