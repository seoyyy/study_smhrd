package hint;

import java.util.ArrayList;

public abstract class Language {
	//상속할때 상위클래스(부모클래스)
	//추상클래스 : 미구현된 클래스 ->의도적으로 
		//1.추상클래스는 객체생성이 불가능 // Language lang = new Language();  XXX
		//2.추상클래스를 상속받은 하위클래스는 상위클래스 내부의 추상메소드를 구현할 강제성을 가진다.->부모가 추상화해놨으면 자식들은 무조건 구체화시켜줘야 사용가능
	
	
	
	//추상메소드 : 미구현된 메소드 -> {}몸체쓰지않아도됨
	//차피 여기메소드를 실제로 갔다쓰는게 아니고 하위클래스 메소드를 가져다쓰니 여기는 추상적으로나타내기
	//어차피 하위클래스에서 재정의(오버라이딩)해서 쓸 메소드를 정리해줌
	public abstract String getTitleMSG();
	
	public abstract String getInputMoneyMSG();
	
	public abstract String getShowMenuMSG1();

	public String getShowMenuMSG2(ArrayList<MenuDTO> menuList) {
		String msg = "";
		for (int i = 0; i < menuList.size(); i++) {
			msg += (i+1)+"."+menuList.get(i).getMenu_name()+" ";
			msg += "("+ menuList.get(i).getMenu_price()+")";
		}
		msg += ">>";
		return msg;
	}

	public abstract String getReturnChange1();
	
	public abstract String getReturnChange2(int money);
	
	
	
	

}
