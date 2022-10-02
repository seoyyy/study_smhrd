package 상속;

public class WheelMouse extends Mouse{
	//상속을 받을수있는 키워드 가져오기 (상속->확장하다   마우스로부터 )
	
	
//	public void right() {
//		System.out.println("우클릭!");
//	}
//	public void left() {
//		System.out.println("좌클릭!");
//	}
//	
//	public void drag() {
//		System.out.println("드래그~");
//	}
	
	//WheelMouse만 가질수 있는 기능 생성
	public void wheel() {
		System.out.println("휠기능 사용~");
	}

}
