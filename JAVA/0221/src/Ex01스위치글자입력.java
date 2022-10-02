import java.util.Scanner;

public class Ex01스위치글자입력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		// .next(): 스트링형태의 데이터를 입력하는 메소드.
		String data = sc.next();
		
		//string 데이터는 참조형 데이터타입이라 == 비교가 불가능. 
		//참조형은 기능을 가지고있어서 기능을 불러와야함.-> equals
		//문자형태를 비교할때는 equals라는 메소드를 사용
//		if(data.equals("한국어")) {
//			System.out.println("안녕하세요!");
//		}else if(data.equals("영어")) {
//			System.out.println("헬로!");
//		}
//		
		
		//스위치문으로 작성-> truefalse라는 조건을 주는게 아니고 , 특정값을 넣어 비교하는것
		//case는 비교연산 -경우에는
		
		switch(data) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로!");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본어":
			System.out.println("곤니찌와");
			break;
		}
		
		
		
		
		

	}

}
