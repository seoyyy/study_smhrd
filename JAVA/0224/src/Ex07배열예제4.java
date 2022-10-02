import java.util.Scanner;

public class Ex07배열예제4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//입력부 -> 배열은 거의 입력부와 출력부 이렇게 나뉨
		for(int i = 0; i<arr.length; i++) {		//i를 인덱스번호로 활용
		System.out.print((i+1)+"번째 입력>> ");
		arr[i] = sc.nextInt();	
		}
		
		//출력부
		System.out.print("입력된 점수 : ");
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		
		int max=arr[0];
		for(int i =0 ; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}		
		//int타입의 배열은 기본값(디폴트값으로)으로 0을 가지고있다. 그래서 데이터입력받기전에 선언하면 0으로 잡힐것
		System.out.println("최고점수 : " + max);
		
		int min=arr[0];
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최저점수 : " + min);
		
		int sum =0;
		for(int i= 0; i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("총합 : "+ sum);
		
		float ave = 0;
		for(int i = 0; i <arr.length ; i++) {
			ave += arr[i];
		}
		System.out.println("평균 : "+ ave/arr.length);
		
		//한번에 합칠수도있음
//		int max = arr[0];
//		int min = arr[0];
//		int sum = 0;
//		
//		for(int i =0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			
//			sum += arr[i];			
//		}
//		
//		System.out.println("최고 점수 : "+ max);
//		System.out.println("최저 점수 : "+ min);
//		System.out.println("총합 : "+ sum);
//		System.out.println("평균 : "+ (double)sum/arr.length );
	}

}
