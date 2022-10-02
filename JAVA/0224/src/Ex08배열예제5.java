
public class Ex08배열예제5 {

	public static void main(String[] args) {
	
//	int[] array = new int[5];
	int[]starCount = {3,4,4,2,1};
	
	//배열의 인덱스의수 만큼 별을 출력해보세요.
	
	for(int i = 0; i < starCount.length; i++) {
		
		System.out.print(starCount[i] + " : ");
		
		for(int j = 1 ; j <= starCount[i] ; j++) {
			System.out.print("*");
		}
	
		System.out.println();
	}
		
		

		
		
		

	}

}
