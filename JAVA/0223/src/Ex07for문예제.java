
public class Ex07for문예제 {

	public static void main(String[] args) {
		
		// 1-2+3-4+...+99-100를 계산하여 답을 출력하시오.
		// 1. 1부터 100까지 출력
		//2. 짝수는 음수 홀수는 양수로 출력
		//3.최종합을 구하기
		int sum = 0; 	//최종 누적합을 구할 변수 선언
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {			// 짝수라면 음수 
				System.out.print(-i +" ");
				sum -= i;
			}else if(i%2==1) {		//홀수라면 양수로 출력
				System.out.print(i +" ");
				sum += i;
			}
		}
	System.out.println(); //줄을 바꿀거에요!->결과를 밑으로내리기위해서 한번적어주기 \n
	System.out.println("결과 : " + sum); //-> syso("\n 결과 : " + sum); 이것도가능 역슬래쉬 엔
		
		
	}

}
