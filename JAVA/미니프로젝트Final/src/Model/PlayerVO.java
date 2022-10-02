package Model;

public class PlayerVO {
	//모델 - vo (DTO)
	//player테이블이랑 관련한 변수 선언, 간접접근이닌까 변수마다 우회접근할수 있도록 getter setter까지 만들어주기 

	private String id;
	private String pw;
	
	private String new_id;
	
	int money;
	
	private int rank;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	public String getNew_id() {
		return new_id;
	}
	public void setNew_id(String new_id) {
		this.new_id = new_id;
	}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
	                   
	
}
