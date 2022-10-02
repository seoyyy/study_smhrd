import java.util.Scanner;

public class Ex09배열예제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int[] ans = {1,4,3,2,1};
	int[] user = new int[5];
	
	//1.uner라는 배열에 사용자가 입력한 값을 넣어주세요.
	
	for(int i = 0; i < user.length; i++) {
	System.out.print((i+1)+"번째 데이터 >> ");
	user[i] = sc.nextInt();
	}
	
	int total =0;
	
	//2. ans 라는 배열과 user라는 배열을 비교해서
	// 값이 같다면 'O', 다르다면 'X'를 출력시켜주세요!
	
	System.out.println("정답확인");
	
	for(int i = 0; i < user.length; i++) {
		
		if(ans[i]==user[i]) {
	System.out.print("O ");
	total+=20;
		}else {
	System.out.print("X ");
	}
	}
	System.out.println("총점 : "+ total);
	
	
	
	}

}
