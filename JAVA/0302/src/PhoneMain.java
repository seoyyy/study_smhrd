
public class PhoneMain {

	public static void main(String[] args) {
	
	int num = 5;
	//클래스란?? 자료 + 기능 사용자 임의의 자료형 (int처럼 그런자료형)->그걸사용하기위해선 변수명도 만들어줘야함.
	phone lollipop = new phone(); //>객체 생성 -> 클래스에 있는 데이터와 기능을 사용할 수 있다.
		//new라는 키워드를 통해서 객체를만들건데 phone클래스 만큼의 크기의 데이터를 lollipop이라는 객체에 에 넣어줄거에요.

	//System.out.println("브랜드 : "+ lollipop.brand);
//	lollipop.call();
	//롤리팝으로 전화를 받고싶어요!
//	lollipop.send();
	
	//System.out.println("전화번호 : "+ lollipop.number);

	//폰바꿈. 브랜드도 바꿈 ->이에맞게 재정의해줘야함.
	phone magic = new phone();
	magic.brand ="애니콜"; //->너가가지고있는 브랜드를 애니콜로 재정의
	magic.number = "01021131231";
			System.out.println("브랜드2 : "+ magic.brand);
	System.out.println("전화 번호 : "+ magic.number);
	
	//여러분의 휴대폰을 객체로 만들어서 출력 시켜주세요.
	
	phone iphone = new phone();
	iphone.brand = "apple";
	iphone.number = "01022223333";
	System.out.println("브랜드 3 : "+ iphone.brand);
	System.out.println("전화번호 3 :"+ iphone.number);
	}

	
	
}
