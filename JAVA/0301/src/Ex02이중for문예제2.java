
public class Ex02이중for문예제2 {

	public static void main(String[] args) {
			
	//2~30까지의 약수를 구하세요.	
		for(int i = 2; i <31; i++) {
			System.out.print(i + "의 약수는 :");
			for(int j =1; j<i+1; j++ ) {
				if(i%j == 0) {
					System.out.print(j + " ");
				}
					}
			System.out.println();
			
		}
		

	}

}
