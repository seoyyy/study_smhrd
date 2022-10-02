
public class Ex04배열예제1 {

	public static void main(String[] args) {
		
		
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		//출력문만 가지고
		//짝수만 출력
		
//		System.out.println(arr[1]);
//		System.out.println(arr[3]);
//		System.out.println(arr[5]);
//		System.out.println(arr[7]);
//		System.out.println(arr[9]);
		
		for(int i =0; i<arr.length; i++) {   //-> 인덱스번호가 0부터라
			if(arr[i]%2==0) {      //i번째 데이터가 4일때 2로나누면~
			System.out.print(arr[i] + " ");
			}
		}
		//배열의 크기를 자동으로 구해오는건 .length ! -> 데이터가 개수가 바뀌면 길이를 일일이수동으로 바꿔줘야하기때문
		// 매번 그값을 바꾸지 않기위해 애초에 컴퓨터한테 그 길이를 구하라고 시키기
	}

}
