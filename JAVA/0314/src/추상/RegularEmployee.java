package 추상;

public class RegularEmployee extends Employee {

//	String empno;
//	String name;
//	int pay;
	int bonus;
	
	//월급계싼법은 직급별로 달라서 구체화시킨것 
	//받고 초기화를 해줄수있는 생성자 메소드(리턴타입없음)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno=empno;
		this.name=name;
		this.pay=pay; //연봉
		this.bonus=bonus;
	}
	//정규직 월급방식
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	//추상클래스에 공통적인 기능이있으닌까 제거
//	public String print() {
//		return empno + " : "+ name + " : " + pay;
//	}
}
