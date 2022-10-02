
public class Ex05for문예제 {

	public static void main(String[] args) {
	
	//1-50까지 369게임을 출력하시오. 조건은
		//끝자리수가 3,6,9 일때는 "박수"를 출력 ->%연산으로 구할수 ㅇ/ or연산 ||
		//끝자리수가 5일때는 "으악"을 출력
		// 그 외의 수는 숫자를 그대로 출력하시오.
		
		
//		for(int i = 1; i<=50; i++) {
//			if(i%10==3 || i%10==6 || i%10==9) {
//				System.out.print("박수 ");
//			}else if(i%10==5) {
//				System.out.print("으악 ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}
		
		//or 기호 없이 풀어보기
		for(int i=1; i<=50;i++) {
		switch(i%10) {			//-> 1의자리가 기준이되고있으니 기준값자리에 나머지넣어주기
		case 3,6,9 :
			System.out.print("박수 ");
			break; //->break가없다면 한번 참이 없다면 아래 나머지도 전부 실행시켜주기때문에 그걸 막아주기위해
		case 5 :
			System.out.print("으악 ");
			break;
		default:
			System.out.print(i+" ");
			
			
		}
		}
		
	}

}
