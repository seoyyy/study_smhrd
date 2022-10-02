
public class Wizard implements Skill{

	// 클래스 상속 -> extends
	// 인터페이스 구현(상속) -> implements 
	
	//스킬에 있는 추상적메소드는 누구에게 물려주면 그 물려준곳에서 무조건 구체화 시켜야함 안그럼 그전까지 오류뜸
	
	public void charAttack() {
		System.out.println("마법봉 휘두르기 ~~");
	}
	public void move() {
		System.out.println("마법 포털 사용하기! 쑝 !");
	}
	
}
