
public class Ex03이차원배열3 {

	public static void main(String[] args) {
		
		
		int[][]array = new int[5][5];
		
		int num = 21;
		
		//입력부
		for(int j = 0; j<array.length; j++) {
		for(int i = 0; i<array[j].length; i++) {
			array[j][i] = num;
			num++;
		}
		}
		
	//특정한조건에 따라 데이터를 꺼내오는 작업
		for(int j = 0; j<array[0].length; j++) { 	//j에관한반복
			for(int i = 0; i<array.length; i++) { //i에관한반복
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
