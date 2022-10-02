package Controller;

import java.util.ArrayList;

import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {

	//controller : 모델과 뷰를 연결해주는 역할
	// -모델이나 뷰에 대한 정보를 알아야한다.(컨트롤러 클래스는 모델과 뷰를 연결해주는 연결다리같은거임)
	//- 모델 또는 뷰의 변경을 인지하여 대체해야 한다. 

	
	//모든 노래를 관리하기 위한 가변리스트 생성!
	ArrayList<MusicVO> musicList = new ArrayList<>(); 
	
	// 몇번째 노래인지 어떻게 알지? --> 인덱스로 판단 할 수 있다!
			int index = 0; //이전곡, 다음곡 전환을 위한 변수
		
	//실질적인 mp3기능		
	MP3Player player = new MP3Player();		
			
	
	//1. 모든 노래정보만을 담을 수 있는 생성자메소드 생성
	public MP3Controller() {
		MusicVO music1 = new MusicVO("깡" , "Rain", 100,"C://music/Rain - 깡.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla" , "Itzy", 120,"C://music/Itzy - Dalla Dalla.mp3");
	//	MusicVO music3 = new MusicVO("SOLO" , "JENNIE" , 200);
		
		//음악 리스트안에 노래를 넣고싶어요!	
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(new MusicVO("SOLO" , "JENNIE" , 200,"C://music/JENNIE - SOLO.mp3"));	
	}
	
	//2.재생을 위한 일반 메소드 생성
	public void playing() {
		 
	 show(musicList, index);
		player.play(musicList.get(index).getPath());
	}
	
	//3.곡정보 출력을 위한 메소드
	public void show(ArrayList<MusicVO> musicList, int index) {
		System.out.print( "제목 : "+musicList.get(index).getMusicName());
		 System.out.print( "가수 : "+musicList.get(index).getSinger());
		 int minit = musicList.get(index).getPlayTime()/60;
		 int secon = musicList.get(index).getPlayTime()%60;
		 System.out.print( "시간 : "+minit+ "분 "+secon+"초");
		 }
	//4.노래 정지를 위한 메소드 생성
	public void stoping() {
	 player.stop();  //_< 노래를멈출수있는 기능
	}
	
	//5. 다음곡 재생 -> nextPlay()
	public void nextPlay() {
	 if(index >= musicList.size()-1) {
		 System.out.println("다음 곡이 없습니다.");
	
	 }else{
	 index++;	 
	 
	 show(musicList, index);
	 //노래가 재생중인지 아닌지 판단! 그전 노래가 실행중이면 멈춰줘야하닌까! 노래가재생중이면 멈춰줘라
	 if(player.isPlaying()) {
		 player.stop();
	 }
	 //다음곡으로 넘길수있는 기능
	 player.play(musicList.get(index).getPath());
	 	 }
	}
	
	//6.이전곡 재생 -> prePlay()
	public void prePlay() {
	 if(index>0) {
	 index--;
	 
	 if(player.isPlaying()) {
		 player.stop();
	 }
	 
	 player.play(musicList.get(index).getPath());
	 
	 show(musicList, index);			 }
	 else {
		 System.out.println("이전 곡이 없습니다.");
	  }
	 
	 
	 
	}
}
