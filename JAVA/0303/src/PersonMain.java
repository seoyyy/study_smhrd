import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
	Person p1 = new Person("승환",20,173,70);  //Person() : 생성자 ->클래스만큼의 공간을 p1(객체)에 할당해준다.
				//데이터를 넣을 공간과 데이터가 함께 만들어진다.
	
	//p1에 대한 승환을 임짜장으로 개명하고싶다
	p1.setName("임짜장");
	System.out.println(p1.getName());
	
	//여긴 원래 디폴트생성자로 공간을 만들었을때 방식
//	p1.name = "서영";	
//	p1.age = 26;
//	p1.height =100;
//	p1.weight = 10;
	//System.out.println("이름 :"+p1.name);
	
	
	//형쌤 객체
	Person p2 = new Person();
	p2.setName("형쌤"); //name을 잠궈나서 setName이라는 기능으로 우회해서 name에 진입
	
	System.out.println("이름2 :" + p2.getName());
	// setName을 통해서 우회해서저장해논 이름을 getName으로 우회해서 가져옴
	
	//형쌤에 대한 객체를 완성해주세요 -->각가의 필드값에 데이터를 전부 넣어주세요.
	p2.setAge(21);
	p2.setWeight(70);
	p2.setHeight(173);
	
	System.out.println("나이2 :"+p2.getAge());
	System.out.println("무게2 :"+p2.getWeight());
	System.out.println("키2 :"+p2.getHeight());
	
	
	
	
//	p1.setName("서영");
//	System.out.println(p1.getName());
		
		
	//p1-승환쌤
	//p2-형쌤
	//p3-라는 동원쌤 객체를 만들고 싶어요! 20 173 70
	Person p3 = new Person("동원쌤",30,175,60);
	//p3라는 수민쌤 객체를 만들고싶어요
	Person p4 = new Person("수민쌤", 21, 160, 40);
	//
	//
	//
	//
	//p100

	//한번에 다룰수있게끔 데이터를 한번에 다룰 수 있는 방법!->배열
	//(객체) 배열 선언
	//데이터타입 [] 배열명 = new 데이터타입[크기];
	Person[] pArray = new Person[4];  //펄슨타입의 개체가 4개 들어갈거라 4
	//pArray에 데이터 넣고시ㅠ어요
	pArray[0]=p1; //int[] numArray = { num1, 20,30} 처럼 변수(객체)가 들어갈수 있음
	pArray[1]=p2;
	pArray[2]=p3;
	pArray[3]=p4;
	
	//pArray를 사용해서 승환쌤의 키를 출력시키고 싶어요
	//pArray[0] ==> p1
	p1.getHeight();
	pArray[0].getHeight(); 
	System.out.println("승환쌤 키 : "+pArray[0].getHeight());
	//pArray를 사용해서 형쌤의 나이를 출력해주세요
	System.out.println("형쌤 나이 :"+ pArray[1].getAge());
	
	//pArray를 사용해서 선생님들의 평균 나이를 출력시켜주세요
	//System.out.println("평균나이 : "+(pArray[0].getAge()+pArray[1].getAge()+pArray[2].getAge()+pArray[3].getAge())/4);
	//인덱스만 늘어나면서 반복하고있음 -> 반복문사용가능
	
	int sum= 0;
	for(int i =0; i <pArray.length;i++) {
		sum += pArray[i].getAge();
	}
	System.out.println("평균나이 : " + sum/pArray.length);
	

	
			for(int i =0; i <pArray.length;i++) {
				System.out.println( pArray[i].getName());
		 }
		//선생님들의 객체를 담을 수 있는 ArrayList를 만들어보겟슴
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		//승환쌤에 대한 정보를 출력하고싶어요!
		//이름 : 승환
		//나이 : 20
		//키 :173
		//몸무게: 70
		//객체어레이리스트 사용법!! 정말중요 !!
		
		//승환이라는 데이터 위치(공간)에 접근부터 .get()으로 / 그리고 거기에서 이름가져오기 ->타고타고들어감
		//일반 배열이었으면 array[]로 가져올수있엇음 but  배열list는 가져오는 get명령어타고들어가야함
		
		System.out.println(pArrayList.get(0).getName());
		System.out.println(pArrayList.get(0).getAge());
		System.out.println(pArrayList.get(0).getHeight());
		System.out.println(pArrayList.get(0).getWeight());
		
		
		
		//pArrayList를 사용해서 선생님들에 대한 정보를 전부 출력시켜주세요
		
		
		for( int i = 0; i < pArrayList.size();i++) {
			System.out.println(pArrayList.get(i).getName());
			System.out.println(pArrayList.get(i).getAge());
			System.out.println(pArrayList.get(i).getHeight());
			System.out.println(pArrayList.get(i).getWeight());
			
		}

	}
}
