package hint;

public class MenuDTO {

//	다른 연산이나 접속을 하지않음
//	자기들이 필드를 가지고있고 그안에 가지고 있던 데이터를 이동시켜주는 역할만함
	
	
	//애가 가지고있는 데이터들은 
	
	//데이터를 표현,저장하기 위한 필드 
	private int menu_num;
	private String menu_name;
	private int menu_price;
//	-메뉴하나에 대한 정보를 담음 -> 그리고 그안에 3개의 컬럼 설정
	
	
	
	
	//메소드
	//1.데이터 초기화 및 객체 생성을 위한 생성자 
	//2.데이터 수정을 위한 setter메소드
	//3.데이터를 꺼내주기 위한 getter메소드 (그 필드들이 private로 막혀있으니 우회하는접근)
	
	//필드들을 초기화할수있는 생성자 
	public MenuDTO(int menu_num, String menu_name, int menu_price) {
		super();
		this.menu_num = menu_num;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}
	
	
	public int getMenu_num() {
		return menu_num;
	}
	public void setMenu_num(int menu_num) {
		this.menu_num = menu_num;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public int getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	
	
	
	
}
