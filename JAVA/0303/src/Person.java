
public class Person {

//이름
	private String name;
//나이
	private int age;
//키
	private int height;
//몸무게
	private int weight;
	
	 //person이라고 하는 메소드를 만듬. 
	 //반환타입이 없음!
	 //->생성자 라고 부름 = 특별한 메소드다. -> 클래스만큼의 공간을 할당한다. 라는 기능 
	 //특징 1. 메소드 이름이 무조건 클래스 이름과같아야한다. 2.반환타입이 없음 존재 자체를 하지 않는다
	 
	// public Person() {} ===> person()이라는 defalut 생성자가 존재 (눈에는 보이지 않음)
	// 						클래스를 만들때 자동으로 만들어 지는 녀석
	 //						새로운 생성자를 아래처럼 만들어 주는 순간 없어짐!
	// 						새로운 생성자를 만든뒤에 사용하고 싶다면 사용자임의로 만들어줘야한다.
	 
	 
	 //데이터를 받는 새로운생성자 선언!(끄럼 디폴트생성자 없어짐)
	 //생성자 -> 특이한 메소드다(리턴자체가 없기 때문에)
	 public Person(String name, int age, int height, int weight) {
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
	 }
	//디폴트 생성자 임의로 다시만들어주기
	 public Person() {
		 
	 }
	//생성자 오버로딩==>오버로딩 같은 Person()의이름으로 다른 매개채를 가지고작업하느 ㄴ오버로딩에 속함 
	 
	//데이터를 받아서 접근하지못하게 막아놓은 name이라는 필드값에 저장시키는 기능을함->우회하는기능만들기 
	public void setName(String name) {
		this.name = name; //저기 매개변수 name을 받아서 this이클래스에있는name에 그name을 담아주자
	} 
		public void setAge(int age) {//저장만하고끝날꺼닌까 int아니고 void
		this.age = age;
	}
		
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public void setHeight(int height) {
			this.height = height;
		}
	//우회해서 저장해논 name을 우회해서 꺼내오는 기능만들기
	public String getName() {
		return name;		
	}
	public int getAge() { 
		return age;
			}
	public int getWeight() {
		return weight;		
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public void getData() {
		System.out.println(name+","+age+","+weight+","+"height");
	}
//	public Person(String name, int age, int height, int weight) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//	}
	 
	 
	//접근에 우회할 메소드
	//이름을 저장할수있는 setName() -->반환타입없음 void
//	public void setName(String name) {
//		this.name = name; 
		//this 키워드는 현재 클래스내에 있는 필드를 정확히 짚어줄때 사용하는 키워드 (매개변수가 같을수도있으닌까 구분하기위해)
//	}
	
	//name을 가져와주세요
//	public String getName() {
//		return name;
//	}
	
	
	
	
}
