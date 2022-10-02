package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		
		//view : 사용자가 사용하는 기능, 시각적으로 확인을 할 수 있는 용도로만 쓰인다( 기능적인부분말고 콘쏠에 띄울수있는그런거)
		//-Model이 가지고 있는 데이터를 저장하지 않는다
		//-단순히 표시만 하는 기능을 갖는다. (보여줄수있는 외관,껍데기)
		
		Scanner sc = new Scanner(System.in);
		
		//controller 와만나게해주는 객체 생성
		MP3Controller controller = new MP3Controller();
		
		
		
		
		//노래를 Main에서 알려주려면?--> MusicVO객체생성
		//깡 			Rain	 100
		//Dalla Dalla 	Itzy 	  120
		//SOLO 			JENNIE 	  200
			
		//메뉴를 보여주고 5를 입력하기 전까지는 계속 반복!
		while(true) {
		System.out.print( "1.재생 2.정지 3.다음곡 4.이전곡 5.종료>>");
		 int menu = sc.nextInt();
		
		 if(menu == 5) {
			 System.out.println("프로그램 종료");
				controller.stoping();
			
			 break;
			}
		 else if(menu == 1) {
			 //곡정보 출력 메소드
			 //재생기능 -->현재 노래에 대한 정보를 출력!
			 //-> 현재 index값에 맞는 노래에 대한 정보를 출력해주세요.
			 //musicList를 이용해서!
			 // 제목 : 깡, 가수 : Rain, 시간: 1분 40초
	
			 controller.playing();  //->컨트롤러에 기능다모아놓고 그 기능을 불러옴
			 
		
		 }else if(menu ==2) {
			 //정지
			 System.out.println("정지");
			
			 controller.stoping();
			 
		 }else if(menu ==3) {
			 //다음곡
			 //dalla dalla 인덱스1번으로 넘어가기(어레이리스트에서 다음곳을 불러워줘야함)
		controller.nextPlay();
			 
			 //solo 까지 출력된 이후에도 다음곳을 선택한다면 '다음곡이 없습니다.' 라는 문구를 출력시켜주세요
			
		 }else if(menu ==4) {
			 //이전곡
			 //깡노래 출력 후 이전곡을 선택했을시 이전곡이 없습니다'라고 출력시켜주세요
			
			 controller.prePlay();
			 
		}

		 System.out.println("프로그램종료");
	
		
		
		
		
		}
	}

	
	}

