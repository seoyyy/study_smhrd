import java.util.Scanner;

public class Ex06조건문예제1 {

	public static void main(String[] args) {
		
	Scanner	sc = new Scanner(System.in);
	
	System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		//삼항연산자 이용해서 age값이 20보다 크면 성인 출력
		//age값이 20보다 작다면 미성녀자입니다. 
		
//	 String res = (age>20)? "성인입니다.":"미성년자입니다.";
//	 System.out.println(res);
 
		
		if (age>=10 && age<20) {
			System.out.println("10대입니다.");
		}else if(age >=20 && age <30) {
		System.out.println("20대입니다.");
		}else if(age>=30 && age<40) {
			System.out.println("30대입니다.");
		}else if(age>=40 && age<50) {
			System.out.println("40대입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
			
		System.out.println("프로그램 종료!");
		
	}

}
