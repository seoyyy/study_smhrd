package hint;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
	
	
	private Scanner sc = new Scanner(System.in);
	private int choice;
	private int money;
	private int itemMoney;
	private MenuDAO dao =new MenuDAO(); //db접속용 dao객체 생성
	private ArrayList<MenuDTO>menuList;
	
	
	//지금은 자판기 내부에서 kor이라는 객체가 이쓴ㄴ거고 외부에서 가져오도록 바꿔주기
	//생성자= 객ㄴ체를 생성도하고 클래스내에 필드를 초기화시켜주는 역할도함
	//생성자는 반환타입이 존재하지않는 메소드
		private Language lang;
	//private Korean kor = new Korean();  //디폴트생성자 -> 내부에서 불러오는
	
	
	//생성자 : 객체를 생성할때 쓰는 호출하는 메소드 / 위에 생성자를 안썻는 데 불러올수있었던건 디폴트값으로생성자가 생겻기때문
	//생성자의 특징 : 반환타입이 없다, 클래스이름과 생성자메소드 이름이 동일해야한다.
	//활용 용도 : 객체를 생성하기 위해, 객체의 필드를 초기화하기 위해
	//생성자를 통해서 객체를 불러오는건 외부에서 집어넣는것 /생성자를통해 객체를 외부에서 불러온걸 필드에 넣겟다~
	public VendingMachine(Language lang) { //생성자를 만들어 언어가 들어올수있도록 만듬
		this.lang = lang;
		menuList = dao.selectAll(); // 메뉴정보 select
		
	}
	
	
	private void showTitle() {		//내부호출로 마무리해서 외부에서 호출할일없으면 private으로 바꿔주면됨.
	System.out.println(lang.getTitleMSG());
	}
	
	public void inputMoney() {
		showTitle();    //내부호출도 가능(JDBC연결할때 getconn도 이방식) 메인에서 불러오는 호출을 줄일수있음->쓰는사람의 편의성고려
		System.out.print(lang.getInputMoneyMSG());
		money = sc.nextInt();
	}
	
	public void showMenu() {
		System.out.println(lang.getShowMenuMSG1());
		System.out.print(lang.getShowMenuMSG2(menuList));
		choice = sc.nextInt();
	}
	
	public void calculateChange() {
		itemMoney = menuList.get(choice-1).getMenu_price();
	}
	
	public void returnChange() {
		if (money - itemMoney < 0) {
			System.out.println(lang.getReturnChange1());
		} else {
			money -= itemMoney;
			System.out.println(lang.getReturnChange2(money));
		} 
		//moeny+getReturnchange 처럼 결합하는게 있다면 입력인자로 넣어버릴수있ㅇ 벤딩머신의 money를 저메소드호출할때 money를 넘겨주기
	}
	

}
