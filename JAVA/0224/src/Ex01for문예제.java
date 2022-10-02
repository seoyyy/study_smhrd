
public class Ex01for문예제 {

	public static void main(String[] args) {
	
	//누적된 합을 구하는 문제 +=
	//(77*1)+(76*2)+++++(1*77) 뒤에값을 기준값으로잡으면 쉬움
	//결과값이 79079
		int total=0;
		for(int i = 1; i<78; i++){
				total += (78-i)*i;				//누적하는 코드
		}
		System.out.println(total);
		
	}

}
