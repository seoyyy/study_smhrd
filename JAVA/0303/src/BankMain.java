import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
	PiggyBank p1 = new PiggyBank(); //->객체생성
	
	//->객체에 money값 넣어주기
//	p1.money = 5000;
	//돈을 사용자가 입력한 금액만큼 money를 증가시키고 싶어요!
	Scanner sc = new Scanner(System.in);
	System.out.print("저금할 금액 입력 :");
	int inputMoney = sc.nextInt();
	//입력한 금액을 money에 증가시키고싶어요 ->money를 private로 은닉해놔서 money로 바로접근할수없음
	//우회해서 가기 
	p1.deposit(inputMoney);
	
	p1.showMoney();
	
	//1.인출할 금액을 입력받아서
	//2.해당하는 금액만큼 money를 차감 시켜주세요.
	//3. 잔액을 출력시켜주세요.
	System.out.print("인출 할 금액 입력 :");
	int outputMoney = sc.nextInt();
	p1.withdrawal(outputMoney);
	p1.showMoney();
	
		
		
		
		
		
	}

}
