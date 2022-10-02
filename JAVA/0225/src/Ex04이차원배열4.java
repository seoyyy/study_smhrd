
public class Ex04이차원배열4 {

	public static void main(String[] args) {
		
		//->전체선택 후 코드 정렬
		//ctrl + a  누른 후에
		//ctrl + shift + f
		
		int[][] array = new int[5][5];

		int num = 21;

		// 입력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = num;
				num++;
			}
		}

		//출력부
		
		for (int j =0; j < array.length; j++) {
			for (int i = array[0].length -1; i >=0 ; i--) {
				System.out.print(array[j][i] + "\t");				
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
		
		for (int j =0; j < array.length; j++) {
			for (int i = array[0].length -1; i >=0 ; i--) {
				System.out.print(array[i][j] + "\t");				
			}
			System.out.println();
		}
		
		
		
	}

}
