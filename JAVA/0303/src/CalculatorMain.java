
public class CalculatorMain {

	public static void main(String[] args) {
	
	//2개의 매개변수를 넘겨받는 생성자를 이용해서 cal이라는 객체 생성
		Calculator cal = new Calculator(40,30);
	//cal객체에 num1과 num2를 더한값을 출력해주세요.	
		System.out.println("더하기 :" + cal.sum());
		
	//call 객체의 num1을 75, num2를 5로 수정해주세요!
		cal.setNum1(75);
		cal.setNum2(5);
		
		System.out.println("더한값"+cal.sum());
		System.out.println("뺀값"+cal.sub());
		System.out.println("곱한값"+cal.mul());
		System.out.println("나눈값"+cal.div());
	}

}
