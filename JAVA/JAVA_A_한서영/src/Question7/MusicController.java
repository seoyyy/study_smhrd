package Question7;

import java.util.ArrayList;

import Question7.MusicVO;

public class MusicController {

	ArrayList<MusicVO> musicList = new ArrayList<>(); 
	int index = 0;
	
	public MP3Controller() {
	}
	
	
	
	public void show(ArrayList<MusicVO> musicList, int index) {
		System.out.print( "제목 : "+musicList.get(index).getMusicName());
		 System.out.print( "가수 : "+musicList.get(index).getSinger());
		 int minit = musicList.get(index).getPlayTime()/60;
		 int secon = musicList.get(index).getPlayTime()%60;
		 System.out.print( "시간 : "+minit+ "분 "+secon+"초");
		 }
}
