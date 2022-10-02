package 캐스팅;

public class DollMain {

	public static void main(String[] args) {

	
	//실질적으로 인형을 뽑을 클래스 !
		Pika pika = new Pika();
		getDoll(pika);
		
		//파이리 인형
		Piri piri = new Piri();
		getDoll(piri);
		
		//꼬북이 인형
		Kkobuck kko = new Kkobuck();
		getDoll(kko);
		
		//메타몽,이브이,치코리타 인형을 뽑아주세요!
		EVe ev = new EVe();
		getDoll(ev);
		
		Metamong meta = new Metamong();
		getDoll(meta);
		
		Chico chico = new Chico();
		getDoll(chico);
		
		
		
		
	}
	//인형뽑기 //Doll이 부모클래스
	public static void getDoll(Doll doll) {
		//업캐스팅 -상위클래스의 타입으로 형변환하는것 (하위클래스 객체를 상위클래스객체에넣는것)
		//1.상위클래스에 있는 필드와 메소드만 사용할 수 있다
		//2.오버라이딩된 메소드는 자식에서 재정의한 메소드를 실행시킨다.
		//--->상위클래스가 하위클래스를 한번에 컨트롤 할 수 있다. (상위클래스의 하나의 객체만으로 하의클래스 기능을 관리가능)		
	
		
	//피카츄인형을 뽑았을때는 백만볼트와 전광석화를 사용하고싶어요 (다운캐스트) -run기능을 사용하기위해 일시적으로 피카츄클래스로바꿔줘야함
		//업캐스팅된 객체 instanceof 하위클래스명-> 업캐스팅된 객체가 어느 하위클래스로부터 업캐스팅되었는지를 판별해줌 
		if(doll instanceof Pika) { //만약 doll이 pika 로부터 업캐스팅되어ㅣㅇㅆ다면 아래를 실행시켜주세요
			//다운캐스팅해서 run기능을 사용
			//doll객체를 다운캐스팅해주세요.
			//하위클래스명 객체명 = (하위클래스타입)업캐스팅된 객체명;
			Pika pi = (Pika)doll;
			pi.run();
		}
		
		doll.get();
		
		//->하나의 객체이름만으로 여러가지기능을 수행시키고있다 --> 다형성
		//(같은 객체 이름으로 여러가지 기능을 수행 시키고 있다 )
	}
//인형뽑기 기능 (메소드 오버로딩)-똑같은이름으로 다른기능을 수행하고있으닌까
//	public static void getDoll(Pika pika) {
//		pika.get();
//	}
//	public static void getDoll(Piri piri) {
//		piri.get();
//	}
//	public static void getDoll(Kkobuck kko) {
//		kko.get();
//	}
//	public static void getDoll(Metamong meta) {
//		meta.get();
//	}
//	public static void getDoll(EVe ev) {
//		ev.get();
//	}
//	public static void getDoll(Chico chico) {
//		chico.get();
//	}
}
