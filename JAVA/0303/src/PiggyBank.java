
public class PiggyBank {

	private int money; //금액에 대해 저장할 int타입의 공간
	
	//금액보여줄 기능 필요
	public void showMoney() {
		System.out.println("잔액 :"+ money);
	}
	
	//저금한 금액을 저장을해놓는 기능 
	public void deposit( int inputMoney) {
		money+=inputMoney;
	}
	
	public void withdrawal(int outputMoney) {
		money-=outputMoney;
	}
}
