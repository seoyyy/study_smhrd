import java.util.ArrayList;

public class ExArrayList01 {

	public static void main(String[] args) {
		
	//배열의 한계 : 이미 크기를 정해져 버려서 데이터를 추가하거나 배열의 크기를 바꿀 수 없다. 
	//배열의 한계를 뛰어 넘는 배열 : ArrayList ->임포트해줘야함
	
	//ArrayList선언방식    
	//ArrayList<배열에 들어갈 데이터의 타입> 어레이리스트명(배열명) = new(배열이시작할위치를 만들어줌) ArrayList가시작할위치<String>();
	ArrayList<String> nameArray = new ArrayList<String>();		//네임어레이가 시작할거에요!
	//데이터추가(넣기)  .add("넣고싶은데이터");
	//add라는 메소드는 데이터를 입력한 순서대로 배열에 차근차근들어간다. 즉 맨 뒤로 차곡차곡 쌓인다.
	nameArray.add("승환쌤");
	nameArray.add("형쌤");
	nameArray.add("동원쌤");
	nameArray.add("수민쌤");
	nameArray.add("자연쌤");
	
	//데이터출력 - araylist의 데이터를 가져올땐 .get(인덱스번호)
	//승환쌤출력
	System.out.println(nameArray.get(0));
	System.out.println(nameArray.get(1));
	

	//arrayList 크기 -> .size()  ==일반 배열에서의 length와 같음!
	for(int i = 0; i < nameArray.size(); i++) {
		System.out.println(nameArray.get(i));
	}
	
	////동원쌤
	
	
	//데이터 삭제 ! .remove(인덱스번호)   //그데이터가 있던 공간도 사라져서 데이터들의인덱스가 앞당겨짐 (크기가 늘었다줄었다함, but일반배열은그게안댐)
	//어떤 특정 조건에서 해당하는 데이터만 지우고싶을때!
//	if(동원쌤이 수업이 없다면) {
//		nameArray.remove(2);
//	}
	nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//중간에 데이터 삽입! .add(넣을 인덱스위치번호, 넣을데이터)   이 add는 오버로딩된것
		nameArray.add(1, "동명");
		
		for(int i = 0; i < nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		nameArray.add(4, "주란");
		for(int i = 0; i < nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		//-->ArrayList에 들어가는 타입은 레퍼런스타입만 가능하다(기본자료형타입쓸쑤없음)
		//기본데이터 타입으로 어레이리스트를 만들어주기 위해서는 기본데이터타입을 표현할 수 있는 클래스를 활용해주면된다.
		// ex) int 타입은 -> Integer라고 적어주기
		//ArrayList<Float> nameArray = new ArrayList<Float>();
		
	}

}
