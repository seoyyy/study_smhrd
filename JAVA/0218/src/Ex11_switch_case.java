
public class Ex11_switch_case {

	public static void main(String[] args) {
		
	int num = 40;
	//switch(기준값)
	// case value: ==> 기준값이랑 value랑 비교해서 같다면 실행시키세요!
	// 실행 문장을 {}로 묶어주지 않는다!
	//case에서는 한번 true로 나온순간 밑에를 전부 true로 인식함 !!(분기문중의 일종인 break를 사용하지않았을경우)
	switch (num) {
	case 10:
		System.out.println("10이 들어있습니다.");
		break;
		//분기문 -> break; (break사용하면->여기까지하고빠져나와주세요해당구문을 끝내주세요라는의미)
	case 20:
		System.out.println("20이 들어있습니다.");
		break;
	case 30 : 
		System.out.println("30이 들어있습니다.");
		break;
		
	default : //다중 if문의 else에 해당되는 기능
		//switch case문에 들어오면 기본으로 이건 해주세요!
		System.out.println("10 20 30아닙니다.");
	}
	
	
		
		
		
		
		

	}

}
