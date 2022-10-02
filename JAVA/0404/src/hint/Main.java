package hint;

import java.util.Scanner;

public class Main {
	//프로그램의 시작점 : 리팩토링 ->기존에 짜놓은 코드를 효율성때문에 코드를 방식을 바꿔주는

	//다국어 기능이 탑재된 자판기로 업그레이드 ->다형성 이용 
	
	public static void main(String[] args) {

//		VendingMachine vm = new VendingMachine();  //객체 생성  (자판기 한대가 짠 생김)
		VendingMachine vm = new VendingMachine(new English());  //이제 메인 이부분의 영어나 코리아거나 여기만바꿔주면 됌
		
		
	//	vm.showTitle();  //그자판기한테 타이틀보여달라 요청불러옴
		vm.inputMoney();
		vm.showMenu();
		vm.calculateChange();
		vm.returnChange();
		

		
		

		
	}

}
