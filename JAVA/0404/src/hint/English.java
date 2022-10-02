package hint;

public class English extends Language {
	//하나의 클래스 및 메소드는 한가지 역할만 담당하도록 설계하는게 good
	public String getTitleMSG() {
		return "===Welcome Vending Machine===";
	}
	
	
	public String getInputMoneyMSG() {
		return "insert coin please >>";
	}
	
	public String getShowMenuMSG1() {
		return "choose your flavor";
	}
	
	
	
	public String getReturnChange1() {
		return "not enough money.";
	}
	
	public String getReturnChange2(int money) {
		return "You have" + money + "won left";
		}
}
