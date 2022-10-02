
public class Ex02for문예제 {

	public static void main(String[] args) {
		
		//for문 문자
		
		//A~Z 출력하는 반복문 작성
		//대문자 A는 아스키코드 값이 65/ 대문자Z는 아스키코드 값이 90
		
		for(int i = 65; i<=90;i++) {
			System.out.print((char)i+ " ");	//i를 문자char로 형변환필요
		}
		
		//for(char i = 65; i <=90; i++){
		// syso( i +" ");}
		
		
	}

}
