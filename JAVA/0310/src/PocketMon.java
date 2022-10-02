
public class PocketMon {

	//설계도 -> 포켓몬 도감
	
	
	//-> 이름, 타입, 공격력, 체력(HP), 방어력 ->속성들
	
	private String name;
	private String type;
	private int attack;
	private int hp;
	private int defence;
	
	//생성자 메소드 만들기 특징
	//1.리턴타입이 없다 = 반환하지않는다 void타입도 사용되지않음
	//2.클래스의 이름과 메소드의 이름이 동일하다.
	public PocketMon() {
		
	}
	//여러개 매개변수를 넣어논 생성자 메소드 ==> 메인클래스에서 생성자메소드로 한번에 내용넣기위한 생성자메소드
	// 메인에서 가져온 매개변수들을 아래에 연결해주고, 가져와서연결한 그데이터를 위에 속성들에 연결을 또해주ㅓ야함.
	public PocketMon(String name, String type, int attack, int defence, int hp) {
		this.name = name;  //이 클래스에 있는 name변수와 매개변수 데이터로 받아온 name이 같은거에요~ 연결해주기
		this.type = type;
		this.attack = attack;
		this.hp = hp;
		this.defence = defence;
	} 
	
	//우회 접근을 위한 getter(가지고와서확인할때)/setter(값을 새롭게 수정하거나 세팅할때)메소드 생성
	
	//포켓몬 이름을 확일할 수 있는 메소드 생성
	public String getName() {		//반환을 해줄거닌까 반환타입String도 지정
		return name;   //설계도안에있는 name으로 반환할거야.
	}
	public String getType() {
		return type;
	}
	public int getAttrack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	public int getDefence() {
		return defence;
	}
	
	//내가 수정하고싶은 값이 있으면 메인클래스에서 바꿔줄수있는 메소드  / int형어떤 매개변수를 받아오겠다 선언해주고
	//이것또한 여기 클래스에 어택과 같은녀석이니 거기에 넣어주세요 하고 연결해주기
	public void setAttack(int attack) {
		this.attack = attack;
		
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
}
