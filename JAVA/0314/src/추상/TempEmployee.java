package 추상;

public class TempEmployee extends Employee {

//	String empno;
//	String name;
//	int pay;
//	
	public TempEmployee(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}
	//계약직 월급방식
	public int getMoneyPay() {
		return pay/12;
	}
	
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}
}
