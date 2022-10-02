
public class Ex08for문구구단 {

	public static void main(String[] args) {
	
	//for문을 사용하여 구구단 2단을 출력하세요.
//		System.out.println("2단");
//		for(int i = 1; i<10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
//		}
//		
//		//3단과 4단도 출력시켜주세요
//		System.out.println("3단");
//		for(int i = 1; i<10; i++) {
//			System.out.println("3 * " + i + " = " + 3*i);
//		}
//		
//		System.out.println("4단");
//		for(int i = 1; i<10; i++) {
//			System.out.println(4 + "*" + i + " = " + 4*i);
//		}
//		
		//이중반복문 or 이중for문 !!
		for(int j = 2; j<5; j++) {
			for(int i = 1; i<10; i++) {
				System.out.println(j + "*" + i + " = " + j*i);
			}
		}
		
	}

}
