package Model;

public class MusicVO {

	//노래라는 데이터를 표현할 수 있는 클래스
	//사용자 임의로 만든 클래스를 통틀어서 -> VO클래스(value object) 사용자가 임의로만들었다하면 무조건 vo클래스
	
	//=>MVC패턴 중 Model에 해당하는 클래스 !(그래서 데이터에대해서만 가지고있으면됨)
	// Model : 데이터를 관리하는곳
	// - 뷰나 컨트롤러에 대한 어떠한 정보도 알 수 없다. 
	// -데이터 변경이 일어나면 처리할 수 있는 방법을 구현해야한다. -> 그방법으로는 getter/setter가 있다. 
	
	private String musicName;
	private String singer;
	private int playTime;
	
	//노래파일경로
	private String path;
	
	
	//생성자는 리턴 타입이?? 어떻게 된다??? 뭐죠..?ㅎㅎ
	//존재 자체를 하지 않는다!아..???
	//생성자를 만들때는 void 나 int String 같은 리턴 타입 자체가 없어요 그래서 아예생략하고 만들어주셔야 합니답!
	//감사합니당 ,,,ㅎㅎ 파이팅 입니답!!!
	///ㅋ/ㅋㅋㅈㅋ넹!
	public MusicVO(String musicName, String singer, int playTime, String path) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	
	public String getMusicName() {
		return musicName;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public String getPath() {
		return path;
	}
}
