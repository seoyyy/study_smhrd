import java.util.Arrays;

public class Ex05메소드6 {

	public static void main(String[] args) {
		
		int[] array = {1,3,4,8,7,9,10};
		int num1 = 10;
		arrayToString(array,num1); //배열안에 있는 데이터를 출력시키는 메소드 
		
		System.out.println("결과1 : "+array[0]); //-> 배열은 참조형이라 바뀜
		System.out.println("결과2 : "+ num1);
	}

	public static void arrayToString(int[] array, int num1) { 
		//-> call-by-reference 참조형이라 주소값을 넘김. 실질적인 값만 넘겨주는 call-by-value라고 불림.
//		for(int i =0; i < array.length; i++) {
//		System.out.print(array[i]	+ " ");
//		}
			
		array[0]=30;  //->불러온 배열의 첫번째값을 30으로 바꿈
		num1= 30;
		System.out.println(Arrays.toString(array)); //->넘겨받은 배열을 전부 한번에 출력시킬수있는 기능. toString하고 엔터치기
	}
	
}
