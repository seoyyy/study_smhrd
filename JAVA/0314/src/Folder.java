
public class Folder extends Tell {
	//폴더폰 클래스(자식,서브클래스)
	
	//상속 키워드 : extends -> 부모로부터 물려받아 확장하다
	// 자식클래스 extends 부모클래스 
	
	
	//전화를 걸다
	//전화를 받다
	//버튼을 누르다
	
	
	//-> 재정의 (오버라이딩)
	//-->키패드를 꾹꾹눌러버튼을 누른다(물려받은 click이라는 메소드를재정의하고싶다)
	public void click() {
		System.out.println("키패드를 꾹꾹 눌러 버튼을 누르다!");
	}
	

	public void folderOpen() {
		System.out.println("전화기를 열다");
	}
	
}
