package 추상;

public abstract class Car {
//이클래스는 추상적인 클래스입니다 하고 class앞에 abstract달아주기
	
	//추상 클래스 : 미완성의 설계도 -> 구체적이지 않은 설계도
		//일반적인 설계도(클래스) -> 필드 + 메소드  (추상클래스는 구체적이지않아 이것들이 없음)
		//추상 클래스의 키워드 : abstract    !!!꼭가지고있어야함!!!
	//추상메소드는 꼭 추상 클래스에 생성되어야한다. 
		
		//자동차 ->포르쉐 , 볼보, 제네시스 ...
		
		//아주기본적인것들만 기본으로 잡아놓고 그걸 토대로 많은 제품들을 만들어나감
		
	//구체적인 몸체를 만들필요가없음. 어차피 다 다른 기능들을 하나씩 설정 및 수정하고 추가해야하니
		int tire = 4;
		String colour;
		
		//몸체{}가 구현되어있지 않은 추상 메소드 ( 몸체를가지고있지않은)
		public abstract void runner();
	

		
	
	
}
