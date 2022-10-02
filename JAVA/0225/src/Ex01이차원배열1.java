
public class Ex01이차원배열1 {

	public static void main(String[] args) {
		
	//4행4열짜리 array라는 이름의 2차원 배열을 만들고 싶어요!
		int[][] array = new int[5][5];
	//데이터를 1부터 25까지 넣어주세요.	
		int num = 1;
	//num을 이용해서 1행에 1-5까지 값을 넣어주세요!
	
	//입력부
	for(int j=0; j<array.length ;j++) {		//이차원배열에서 그냥 array.length는 첫번째 배열의 길이를 나타냄
		
		for(int i = 0; i<array[j].length;i++) {
			array[j][i] = num;
			num++;
		}
		
	}
	//출력부
	//2차원 배열 출력
	//1 2 3 4 5
	//6 7 8 9 10 
	for(int j = 0; j<array.length; j++) {
	for(int i = 0; i<array[j].length; i++) {
		System.out.print(array[j][i]+" "); //->" " 대신  "\t" 넣으면 ->tab만큼 띄어라!
	}
	System.out.println();
	}	
		
	}

}
