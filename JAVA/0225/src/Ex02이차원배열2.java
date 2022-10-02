
public class Ex02이차원배열2 {

	public static void main(String[] args) {
		
	int[][]array = new int[5][5];
	
	int num = 21;
	for(int j = 0; j<array.length; j++) {
	for(int i = 0; i<array[j].length; i++) {
		array[j][i] = num;
		num++;
	}
	}
		
	for(int j = 0; j<array.length; j++) {
		for(int i = 0; i<array[j].length; i++) {
			System.out.print(array[j][i]+"\t");
		}
		System.out.println();
		}	
		
		
		
		

	}

}
