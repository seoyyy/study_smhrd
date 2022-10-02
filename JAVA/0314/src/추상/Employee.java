package 추상;

public abstract class Employee {

	//3개직급에대해 부모가될수있는 추상클래스 ->abstract
	//->직급에 대하여 연봉을 계산할 수 있는 필드 및 메소드가 존재해야한다. 
	
	//사번이름연봉이 공통되니 공통되는 필드선언
	//접근 지정자 = public(내/외부 모두 접근허용), private(내부에서만 허용), protected, default(생락가능)
	//protected(같은 패키지 혹은 상속의 관계에서만 허용)
	protected String empno;
	protected String name;
	protected int pay;
	
	//왜 추상을 줘야하나?!
	//직급별로 계산법이달라지닌까
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
	
}
