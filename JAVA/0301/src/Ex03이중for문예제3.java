
public class Ex03이중for문예제3 {

	public static void main(String[] args) {
		
	//별모양 출력
		
//	for(int i = 0; i<5; i++) {
//		
//		for(int j= 0; j<5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
		for(int line = 0; line<5; line++) {
			for(int star = 0; star<line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
