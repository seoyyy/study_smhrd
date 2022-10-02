package Ãß»ó;

public class PartTimeEmployee extends Employee {

//	String empno;
//	String name;
//	int pay;
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay=pay;
		this.workDay=workDay;
	}
	public int getMoneyPay() {
		return pay*workDay;
	}
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}
	
}
