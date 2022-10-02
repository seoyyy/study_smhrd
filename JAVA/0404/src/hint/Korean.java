package hint;

public class Korean extends Language{

	public String getTitleMSG() {
		return "===자판기 프로그램===";
	}
	
	
	public String getInputMoneyMSG() {
		return "돈을 넣으세요 >>";
	}
	
	public String getShowMenuMSG1() {
		return "메뉴를 선택하세요";
	}
	

	
	public String getReturnChange1() {
		return "돈이 부족합니다.";
	}
	
	public String getReturnChange2(int moeny) {
		return "현재 " + moeny + "원이 남았습니다.";
		}
	
}
