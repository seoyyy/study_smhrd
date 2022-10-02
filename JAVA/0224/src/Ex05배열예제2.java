
public class Ex05배열예제2 {

	public static void main(String[] args) {
	
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		
		//arr배열 안에서 최대값(제일 큰값) 출력 ->47
		//하나씩 꺼내가며 돌아가면서 비교해줘야함.
		//비교할 기준 선정 - arr에 첫번째 숫자를 기준=>index번호0번자리 꼭 !
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length ; i++) {
			//내가 가졌던 기준점 max랑 arr안에 있는 숫자들을
			//하나씩 꺼내보면서 비교를해봐야함
			//max보다 큰값이 최대값 그걸 max에 저장
			if( arr[i] > max) {
				max = arr[i];
			}
			
			
		}
		//출력문을 통해 max값 출력
			System.out.println(max);
			
		//최소값구하기	
			for(int i = 0; i < arr.length; i++) {
				if (arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println(min);
	}

}
